# SPIRES project guide

This guide is for a developer or AI assistant resuming work on SPIRES. The actual NetBeans project is `C:\Users\USER\Documents\Projects\Sacrament-Registry`; the separate `C:\Users\USER\Documents\ChatGPT\SPIRES` folder was an empty Git repository when this guide was written.

## Quick start

1. Open `Sacrament-Registry` as a project in NetBeans 8.2.
2. Use JDK 8. The installed NetBeans configuration points to `C:\Program Files\Java\jdk1.8.0_101`.
3. Read `nbproject/project.properties` before changing the build. This is a NetBeans Ant project, with `build.xml` importing `nbproject/build-impl.xml`. The main class is `SR.main.Main`, source is `src`, and output goes to `build` and `dist/Spires.jar`.
4. Build with NetBeans **Clean and Build**, or with `ant clean jar` from the project root after confirming that Ant and the NetBeans library named `maytopacka` are available. The project declares Java source/target level 1.6, so a newer JDK or compiler setup may need adjustment.
5. Run through NetBeans first. The application expects a MySQL database and optional runtime configuration; a successful compile alone does not prove the UI or database workflows work.

## Structure and entry points

| Path | Purpose |
| --- | --- |
| `src/SR/main/Main.java` | Application entry point; reads optional `spires.conf` and starts the UI. |
| `src/spires/pnl/Dashboard.java` | Main Swing dashboard/window. |
| `src/spires/login`, `src/spires/users` | Login and user features. |
| `src/spires/baptismal_records`, `confirmation_records`, `marriage_records`, `funeral_records` | Sacramental record workflows. |
| `src/spires/parishioners`, `my_parishioners` | Parishioner data. |
| `src/spires/cashiering`, `accounting`, `expenses`, `disbursements`, `receipts` | Financial workflows. |
| `src/spires/reports`, `printing`, `certificates`, `templates` | Reports, printing, certificates, and templates. |
| `src/spires/util` | Shared UI, date, table, and database helpers. |
| `src/spires/util/MyConnection.java` | JDBC connection helper; reads connection values from system properties. |
| `src/spires/sql` | SQL-related code and resources; inspect before changing schema assumptions. |
| `nbproject` | NetBeans project settings and generated Ant build logic. |
| `test` | Present but empty at the time of inspection. |

There are about 207 Java source files and 86 NetBeans `.form` files. Many UI screens have paired `.java` and `.form` files. Keep those pairs in sync; avoid hand-editing generated Swing layout code unless the NetBeans form designer cannot express the change.

## Fast implementation workflow

1. Find the feature package by screen or domain name, then search for the exact class, action handler, SQL statement, or visible UI text with `rg`.
2. Trace from the `Dlg_*` or `S*_*` screen into its helper or data class and shared methods in `spires.util`. Check callers before changing method signatures or SQL column expectations.
3. Make the smallest focused edit. Follow the existing Java 6 compatible style unless the build configuration is deliberately upgraded.
4. For a form change, inspect both `.java` and `.form`; open the form in NetBeans to confirm the designer still loads.
5. Build the project. For database or printing changes, test the specific workflow with a safe test database/printer configuration. Do not infer production behavior from a compile alone.
6. Record the files changed, the behavior verified, and any untested external dependency in the session handoff.

## Runtime configuration and cautions

`Main.java` looks for an optional configuration file named `spires.conf` in the user's home directory and then the working directory, or accepts a configuration filename as its first argument. It sets system properties used by the application. `MyConnection.java` uses `pool_host`, `pool_user`, `pool_password`, and `mydb` for a MySQL JDBC connection. Inspect the code and local configuration before running database operations. Keep real credentials out of Git and documentation.

The repository may depend on NetBeans-managed libraries and plugins. The classpath references `${libs.maytopacka.classpath}`; confirm that library exists in the NetBeans installation before treating a compile failure as a source-code defect. The current `test` directory has no test files.

## Session handoff (2026-09-19)

- The baptismal certificate report has three modes: completed preview; blank certificate with church details and signing priest, without parishioner information; and parishioner details only, without the background or priest. The records dialog uses its existing **Priest** and **Designation** inputs in the Certificate preparation section; there is no second priest input. The Priest value supplies the printed signing name, while the A4 artwork already contains the fixed **Parish Priest** designation. The **Pre-print blank certificate...** action is available without a parishioner record. The preview dialog has explicit buttons for preprinting, testing details on blank paper, and printing details on the signed form. The Jasper viewer's own print/export controls are hidden to prevent the wrong layer from being sent to the printer.
- The preview dialog has right/left and down/up alignment controls in millimeters, saved for the current Windows user. Positive values move the variable text right or down while the preview background remains fixed. Start at zero, print an alignment test on blank A4 paper, compare it with the preprinted form, then adjust in 0.5 mm steps.
- `rpt_baptism_certificate_2025.jrxml` uses `show_background`, `show_parishioner`, and `show_priest` to select content from the same layout. The priest name is centered over the preprinted designation. Keep both print passes at A4 and 100% scaling, and preserve paper orientation and feed direction. Fine alignment still depends on the physical printer.
- The 2025 report is selected by the **A4 preprinted form** radio button in `Dlg_baptismal_records.java`. Legacy baptism reports continue to preview, but layered print buttons are disabled for them. The blank preprint action works without selecting a parishioner record; completed preview and the details-only print require a record.
- Git was clean on branch `broder` before these documentation and certificate changes. Recheck `git status` before editing.
- NetBeans 8.2 runs on this Windows machine with Java 8. A delayed `LoadLibrary failed with error 87` dialog appeared in the NetBeans process. The process had loaded AMD graphics driver DLL `atig6pxx.dll`. Windows graphics preference for `netbeans64.exe` was set to high performance (`GpuPreference=2`) for the next launch; whether that resolves the dialog still needs verification after a restart.
- The dialogs compiled with the installed JDK 8 and JasperReports classpath. The JRXML filled as one A4 page in all three modes: completed preview (18 elements, one image), blank preprint (four elements, one image), and details overlay (14 elements, no image). Sample completed and blank preprint PDF renders were visually reviewed, including the priest-name centering. The records dialog was rendered at 1280 x 800 both with and without the record editor to check spacing and clipping. The full NetBeans Ant `jar` build succeeded using JDK 8. A physical printer alignment check remains to be done.
- For confirmation certificates, reuse the same preview/ink-only pattern with its own preprinted artwork and parameter mapping. Confirm the paper size and which fields are already on the signed stock before adapting the report.
- Before continuing implementation, inspect current Git status and establish a build baseline. Do not assume the graphics dialog is caused by SPIRES application code.
