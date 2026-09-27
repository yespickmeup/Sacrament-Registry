package spires.good_moral_records;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import spires.officials.Dlg_officials;
import spires.officials.Officials;
import spires.users.Res;

public class Dlg_good_moral_records extends JDialog {
    private static final Color PAGE_COLOR = new Color(243, 246, 250);
    private static final Color INK_COLOR = new Color(35, 49, 66);
    private final List<GoodMoralRecord> records = new ArrayList<GoodMoralRecord>();
    private final List<Officials.to_officials> officials = new ArrayList<Officials.to_officials>();
    private long selectedId = -1;

    private JTextField searchField;
    private JRadioButton searchName;
    private JRadioButton searchProtocol;
    private JComboBox priestField;
    private JTextField designationField;
    private JTable recordsTable;
    private DefaultTableModel recordsModel;
    private JPanel body;
    private JPanel editorHolder;
    private JTextField protocolField;
    private JTextField nameField;
    private JTextArea residenceField;
    private JComboBox sexField;
    private JTextArea purposeField;
    private JDateChooser issuedOnField;
    private JTextArea remarksField;
    private JLabel recordCount;

    public Dlg_good_moral_records() {
        this((java.awt.Frame) null, false);
    }

    public Dlg_good_moral_records(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initialize();
    }

    public Dlg_good_moral_records(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initialize();
    }

    public static Dlg_good_moral_records create(Window parent, boolean modal) {
        if (parent instanceof java.awt.Frame) {
            return new Dlg_good_moral_records((java.awt.Frame) parent, modal);
        }
        return new Dlg_good_moral_records((java.awt.Dialog) parent, modal);
    }

    public JPanel getSurface() {
        return (JPanel) getContentPane();
    }

    private void initialize() {
        initComponents();
        setTitle("Good moral character records");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        buildUi();
        setSize(1240, 800);
        setMinimumSize(new Dimension(1050, 680));
        KeyMapping.mapKeyWIFW(getSurface(), KeyEvent.VK_ESCAPE, new KeyAction() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });
    }

    public void do_pass() {
        refreshOfficials("");
        refreshRecords();
    }

    public static void main(final String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final Dlg_good_moral_records dialog =
                        new Dlg_good_moral_records((java.awt.Frame) null, false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent event) {
                        System.exit(0);
                    }
                });
                if (args == null || args.length == 0
                        || !"--design-only".equalsIgnoreCase(args[0])) {
                    dialog.do_pass();
                }
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        designSurface = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Good moral character records");

        designSurface.setBackground(new java.awt.Color(243, 246, 250));
        designSurface.setBorder(javax.swing.BorderFactory.createEmptyBorder(18, 20, 18, 20));

        javax.swing.GroupLayout designSurfaceLayout = new javax.swing.GroupLayout(designSurface);
        designSurface.setLayout(designSurfaceLayout);
        designSurfaceLayout.setHorizontalGroup(
            designSurfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        designSurfaceLayout.setVerticalGroup(
            designSurfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designSurface, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designSurface, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buildUi() {
        JPanel page = designSurface;
        page.removeAll();
        page.setLayout(new BorderLayout(0, 16));
        page.setBackground(PAGE_COLOR);
        page.setBorder(BorderFactory.createEmptyBorder(18, 20, 18, 20));

        JPanel heading = new JPanel(new BorderLayout());
        heading.setOpaque(false);
        JLabel title = new JLabel("Good moral character records");
        title.setForeground(INK_COLOR);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        heading.add(title, BorderLayout.NORTH);
        JLabel subtitle = new JLabel("Create the record, pre-print the certificate for signing, then print recipient details.");
        subtitle.setForeground(new Color(90, 102, 116));
        heading.add(subtitle, BorderLayout.SOUTH);
        JButton close = new JButton("Close");
        setButtonIcon(close, "/spires/img_dashboard/direction102 (2).png");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { dispose(); }
        });
        heading.add(close, BorderLayout.EAST);
        page.add(heading, BorderLayout.NORTH);

        JPanel left = new JPanel(new BorderLayout(0, 14));
        left.setOpaque(false);
        left.add(buildSearchAndCertificateCard(), BorderLayout.NORTH);
        left.add(buildRecordsCard(), BorderLayout.CENTER);
        editorHolder = new JPanel(new BorderLayout());
        editorHolder.setOpaque(false);
        editorHolder.setPreferredSize(new Dimension(440, 600));
        editorHolder.add(buildEditor(), BorderLayout.CENTER);
        editorHolder.setVisible(false);

        body = new JPanel(new BorderLayout(16, 0));
        body.setOpaque(false);
        body.add(left, BorderLayout.CENTER);
        body.add(editorHolder, BorderLayout.EAST);
        page.add(body, BorderLayout.CENTER);
    }

    private JPanel buildSearchAndCertificateCard() {
        JPanel card = card();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(sectionTitle("Find a good moral record"));
        card.add(Box.createVerticalStrut(8));
        JPanel filters = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 0));
        filters.setOpaque(false);
        filters.setAlignmentX(LEFT_ALIGNMENT);
        filters.add(new JLabel("Search by:"));
        searchName = new JRadioButton("Name", true);
        searchProtocol = new JRadioButton("Protocol number");
        ButtonGroup searchGroup = new ButtonGroup();
        searchGroup.add(searchName); searchGroup.add(searchProtocol);
        filters.add(searchName); filters.add(searchProtocol);
        card.add(filters);
        card.add(Box.createVerticalStrut(8));
        searchField = new JTextField();
        searchField.setToolTipText("Type a name or protocol number, then press Enter");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { refreshRecords(); }
        });
        card.add(horizontalField(new JLabel("Entry:"), searchField));
        card.add(Box.createVerticalStrut(14));
        card.add(sectionTitle("Certificate preparation"));
        card.add(Box.createVerticalStrut(8));
        priestField = new JComboBox();
        priestField.setEditable(true);
        priestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { updateDesignation(); }
        });
        designationField = new JTextField("Parish Priest");
        JPanel priestInput = new JPanel(new BorderLayout(8, 0));
        priestInput.setOpaque(false);
        priestInput.add(priestField, BorderLayout.CENTER);
        JButton officialsSettings = new JButton("Settings...");
        setButtonIcon(officialsSettings, "/spires/img_dashboard/cogwheels4 (3).png");
        officialsSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { openOfficialsSettings(); }
        });
        priestInput.add(officialsSettings, BorderLayout.EAST);
        JPanel signatory = new JPanel(new GridLayout(1, 2, 12, 0));
        signatory.setOpaque(false);
        signatory.setAlignmentX(LEFT_ALIGNMENT);
        signatory.add(fieldBlock("Signing priest", priestInput));
        signatory.add(fieldBlock("Designation", designationField));
        card.add(signatory);
        card.add(Box.createVerticalStrut(10));
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        actions.setOpaque(false);
        actions.setAlignmentX(LEFT_ALIGNMENT);
        JButton preprint = new JButton("Pre-print blank certificate...");
        setButtonIcon(preprint, "/spires/img_dashboard/paper6.png");
        preprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { previewBlankCertificate(); }
        });
        actions.add(preprint);
        JLabel hint = new JLabel("  A4 form + priest name; recipient details stay blank");
        hint.setForeground(new Color(90, 102, 116));
        actions.add(hint);
        card.add(actions);
        return card;
    }

    private JPanel buildRecordsCard() {
        JPanel card = card();
        card.setLayout(new BorderLayout(0, 10));
        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(sectionTitle("Records"), BorderLayout.WEST);
        JButton add = new JButton("New record");
        setButtonIcon(add, "/spires/img_dashboard/refresh57.png");
        add.setToolTipText("Create a good moral character record");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { newRecord(); }
        });
        top.add(add, BorderLayout.EAST);
        card.add(top, BorderLayout.NORTH);
        recordsModel = new DefaultTableModel(new Object[] {
            "Protocol", "Name", "Residence", "Issued", "Signing priest"
        }, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        recordsTable = new JTable(recordsModel);
        recordsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        recordsTable.setRowHeight(25);
        DefaultTableCellRenderer paddedCell = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean selected, boolean focused, int row, int column) {
                JComponent component = (JComponent) super.getTableCellRendererComponent(
                        table, value, selected, focused, row, column);
                component.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 6));
                return component;
            }
        };
        for (int column = 0; column < recordsTable.getColumnCount(); column++) {
            recordsTable.getColumnModel().getColumn(column).setCellRenderer(paddedCell);
        }
        recordsTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                if (event.getClickCount() >= 1) { selectRecord(); }
            }
        });
        card.add(new JScrollPane(recordsTable), BorderLayout.CENTER);
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        footer.setOpaque(false);
        footer.add(new JLabel("Total No. of Records:"));
        recordCount = new JLabel("0");
        footer.add(recordCount);
        card.add(footer, BorderLayout.SOUTH);
        return card;
    }

    private JComponent buildEditor() {
        JPanel fields = card();
        fields.setLayout(new BoxLayout(fields, BoxLayout.Y_AXIS));
        fields.add(sectionTitle("Selected record"));
        fields.add(Box.createVerticalStrut(10));
        protocolField = new JTextField();
        nameField = new JTextField();
        fields.add(formRow(fieldBlock("Protocol number", protocolField), fieldBlock("Full name", nameField)));
        fields.add(Box.createVerticalStrut(10));
        residenceField = textArea(3);
        fields.add(fieldBlock("Residence", new JScrollPane(residenceField)));
        fields.add(Box.createVerticalStrut(10));
        sexField = new JComboBox(new String[] {"Man", "Woman"});
        issuedOnField = new JDateChooser(new Date());
        issuedOnField.setDateFormatString("MMM d, yyyy");
        fields.add(formRow(fieldBlock("Sex / pronouns", sexField), fieldBlock("Issue date", issuedOnField)));
        fields.add(Box.createVerticalStrut(10));
        purposeField = textArea(3);
        purposeField.setText("whatever noble purpose");
        fields.add(fieldBlock("Purpose", new JScrollPane(purposeField)));
        fields.add(Box.createVerticalStrut(10));
        remarksField = textArea(3);
        fields.add(fieldBlock("Remarks", new JScrollPane(remarksField)));
        fields.add(Box.createVerticalGlue());
        JScrollPane scroll = new JScrollPane(fields);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getVerticalScrollBar().setUnitIncrement(16);

        JPanel actions = card();
        actions.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 0));
        JButton preview = new JButton("Preview...");
        setButtonIcon(preview, "/spires/img_dashboard/paper6.png");
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { previewCertificate(); }
        });
        JButton save = new JButton("Save");
        setButtonIcon(save, "/spires/img_dashboard/save-file.png");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { saveRecord(); }
        });
        JButton delete = new JButton("Delete");
        setButtonIcon(delete, "/spires/img_dashboard/rubbish12.png");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { deleteRecord(); }
        });
        JButton close = new JButton("Close");
        setButtonIcon(close, "/spires/img_dashboard/direction102 (2).png");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { hideEditor(); }
        });
        actions.add(preview); actions.add(save); actions.add(delete); actions.add(close);
        JPanel holder = new JPanel(new BorderLayout(0, 8));
        holder.setOpaque(false);
        holder.add(scroll, BorderLayout.CENTER);
        holder.add(actions, BorderLayout.SOUTH);
        return holder;
    }

    private JTextArea textArea(int rows) {
        JTextArea area = new JTextArea(rows, 20);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        return area;
    }

    private void newRecord() {
        selectedId = -1;
        protocolField.setText(""); nameField.setText(""); residenceField.setText("");
        sexField.setSelectedIndex(0); issuedOnField.setDate(new Date());
        purposeField.setText("whatever noble purpose"); remarksField.setText("");
        showEditor();
        protocolField.requestFocusInWindow();
    }

    private void selectRecord() {
        int row = recordsTable.getSelectedRow();
        if (row < 0 || row >= records.size()) { return; }
        GoodMoralRecord record = records.get(row);
        selectedId = record.id;
        protocolField.setText(record.protocolNo); nameField.setText(record.personName);
        residenceField.setText(record.residence); sexField.setSelectedItem(record.sex);
        purposeField.setText(record.purpose); issuedOnField.setDate(record.issuedOn);
        remarksField.setText(record.remarks);
        selectPriest(record.signingPriest, record.priestDesignation);
        showEditor();
    }

    private void refreshRecords() {
        try {
            List<GoodMoralRecord> loaded = GoodMoralRecords.search(
                    searchField.getText().trim(), searchProtocol.isSelected());
            records.clear(); records.addAll(loaded); recordsModel.setRowCount(0);
            java.text.SimpleDateFormat display = new java.text.SimpleDateFormat("MMM d, yyyy");
            for (GoodMoralRecord record : records) {
                recordsModel.addRow(new Object[] {record.protocolNo, record.personName,
                    record.residence, display.format(record.issuedOn), record.signingPriest});
            }
            recordCount.setText(Integer.toString(records.size()));
        } catch (RuntimeException ex) {
            showDatabaseError(ex);
        }
    }

    private GoodMoralRecord formRecord() {
        String priest = selectedPriest();
        String user = Res.getUser_name();
        return new GoodMoralRecord(selectedId, protocolField.getText().trim(),
                nameField.getText().trim(), residenceField.getText().trim(),
                sexField.getSelectedItem().toString(), purposeField.getText().trim(),
                issuedOnField.getDate(), priest, designationField.getText().trim(),
                remarksField.getText().trim(), user == null ? "" : user);
    }

    private boolean validateForm() {
        if (protocolField.getText().trim().isEmpty() || nameField.getText().trim().isEmpty()
                || residenceField.getText().trim().isEmpty() || issuedOnField.getDate() == null
                || purposeField.getText().trim().isEmpty()
                || selectedPriest().isEmpty() || designationField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Protocol number, name, residence, purpose, issue date, signing priest, and designation are required.",
                    "Complete the record", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    private void saveRecord() {
        if (!validateForm()) { return; }
        try {
            GoodMoralRecord record = formRecord();
            if (selectedId < 0) { GoodMoralRecords.add(record); }
            else { GoodMoralRecords.update(record); }
            refreshRecords();
            hideEditor();
        } catch (RuntimeException ex) { showDatabaseError(ex); }
    }

    private void deleteRecord() {
        if (selectedId < 0) { return; }
        if (JOptionPane.showConfirmDialog(this, "Delete this certificate record?",
                "Delete record", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE) != JOptionPane.OK_OPTION) { return; }
        try {
            GoodMoralRecords.delete(selectedId);
            hideEditor(); refreshRecords();
        } catch (RuntimeException ex) { showDatabaseError(ex); }
    }

    private void previewCertificate() {
        if (!validateForm()) { return; }
        Dlg_preview_good_moral_certificate preview =
                Dlg_preview_good_moral_certificate.create(this, true);
        preview.do_pass(formRecord());
        preview.setLocationRelativeTo(this); preview.setVisible(true);
    }

    private void previewBlankCertificate() {
        if (selectedPriest().isEmpty() || designationField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Choose the signing priest and designation first.",
                    "Signing priest required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Dlg_preview_good_moral_certificate preview =
                Dlg_preview_good_moral_certificate.create(this, true);
        preview.do_pass_preprint(selectedPriest(), designationField.getText().trim());
        preview.setLocationRelativeTo(this); preview.setVisible(true);
    }

    private void refreshOfficials(String preferredName) {
        try {
            officials.clear(); officials.addAll(Officials.retData(" order by name asc"));
            priestField.removeAllItems();
            for (Officials.to_officials official : officials) { priestField.addItem(official.name); }
            if (preferredName != null && !preferredName.isEmpty()) { selectPriest(preferredName, ""); }
            else { updateDesignation(); }
        } catch (RuntimeException ex) { showDatabaseError(ex); }
    }

    private void selectPriest(String name, String savedDesignation) {
        for (int i = 0; i < officials.size(); i++) {
            Officials.to_officials official = officials.get(i);
            if (name.equalsIgnoreCase(official.name.trim())) {
                priestField.setSelectedIndex(i);
                designationField.setText(official.title);
                return;
            }
        }
        priestField.setSelectedItem(name == null ? "" : name);
        designationField.setText(savedDesignation == null ? "" : savedDesignation);
    }

    private void updateDesignation() {
        int index = priestField == null ? -1 : priestField.getSelectedIndex();
        if (index >= 0 && index < officials.size()) {
            designationField.setText(officials.get(index).title);
        }
    }

    private String selectedPriest() {
        Object selected = priestField.getSelectedItem();
        return selected == null ? "" : selected.toString().trim();
    }

    private void showEditor() {
        editorHolder.setVisible(true);
        body.revalidate();
        body.repaint();
    }

    private void hideEditor() {
        editorHolder.setVisible(false);
        body.revalidate();
        body.repaint();
    }

    private void openOfficialsSettings() {
        String selected = selectedPriest();
        Dlg_officials dialog = Dlg_officials.create(this, true);
        dialog.do_pass(); dialog.setLocationRelativeTo(this); dialog.setVisible(true);
        refreshOfficials("");
        if (officialExists(selected)) {
            selectPriest(selected, "");
        } else {
            priestField.setSelectedItem("");
            designationField.setText("");
        }
    }

    private boolean officialExists(String name) {
        if (name == null || name.trim().isEmpty()) { return false; }
        for (Officials.to_officials official : officials) {
            if (name.trim().equalsIgnoreCase(official.name.trim())) { return true; }
        }
        return false;
    }

    private void showDatabaseError(RuntimeException ex) {
        String message = ex.getMessage();
        Throwable cause = ex.getCause();
        if (cause != null && cause.getMessage() != null) { message = cause.getMessage(); }
        if (message != null && message.toLowerCase().contains("good_moral_records")) {
            message += "\n\nApply src/spires/versions/2026_09_27_good_moral_records.sql to this parish database.";
        }
        JOptionPane.showMessageDialog(this, message, "Good moral records", JOptionPane.ERROR_MESSAGE);
    }

    private JPanel card() {
        JPanel panel = new JPanel(); panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(221, 228, 235)),
                BorderFactory.createEmptyBorder(14, 16, 14, 16)));
        return panel;
    }

    private JLabel sectionTitle(String text) {
        JLabel label = new JLabel(text); label.setAlignmentX(LEFT_ALIGNMENT);
        label.setForeground(INK_COLOR); label.setFont(label.getFont().deriveFont(Font.BOLD, 14f));
        return label;
    }

    private void setButtonIcon(JButton button, String resource) {
        java.net.URL iconUrl = getClass().getResource(resource);
        if (iconUrl != null) {
            button.setIcon(new javax.swing.ImageIcon(iconUrl));
        }
    }

    private JPanel horizontalField(JLabel label, JComponent field) {
        JPanel row = new JPanel(new BorderLayout(10, 0));
        row.setOpaque(false);
        row.setAlignmentX(LEFT_ALIGNMENT);
        row.add(label, BorderLayout.WEST);
        row.add(field, BorderLayout.CENTER);
        return row;
    }

    private JPanel fieldBlock(String title, JComponent field) {
        JPanel block = new JPanel(new BorderLayout(0, 4)); block.setOpaque(false);
        block.setAlignmentX(LEFT_ALIGNMENT); JLabel label = new JLabel(title);
        label.setForeground(new Color(81, 94, 109)); block.add(label, BorderLayout.NORTH);
        block.add(field, BorderLayout.CENTER); return block;
    }

    private JPanel formRow(JPanel... blocks) {
        JPanel row = new JPanel(new GridLayout(1, blocks.length, 10, 0));
        row.setOpaque(false); row.setAlignmentX(LEFT_ALIGNMENT);
        for (JPanel block : blocks) { row.add(block); }
        return row;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel designSurface;
    // End of variables declaration//GEN-END:variables
}
