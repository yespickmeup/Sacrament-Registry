-- Demo data for Certificate of Good Moral Character
-- Prerequisite: run 2026_09_27_good_moral_records.sql first.
-- Safe to run repeatedly: protocol_no is unique and INSERT IGNORE skips existing rows.

INSERT IGNORE INTO good_moral_records
    (protocol_no, person_name, residence, sex, purpose, issued_on,
     signing_priest, priest_designation, remarks, created_by, created_at, updated_at)
VALUES
    ('GMC-DEMO-001', 'Maria C. Santos',
     'West Poblacion, Bacong, Negros Oriental', 'Woman',
     'whatever noble purpose', '2026-01-15',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo record for UI and printing tests.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-002', 'Juan Miguel R. Flores',
     'North Poblacion, Bacong, Negros Oriental', 'Man',
     'whatever noble purpose', '2026-02-03',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo employment certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-003', 'Angela Mae T. Villanueva',
     'Barangay San Miguel, Bacong, Negros Oriental', 'Woman',
     'whatever noble purpose', '2026-02-18',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo scholarship certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-004', 'Carlo B. Ramirez',
     'Barangay Combado, Bacong, Negros Oriental', 'Man',
     'whatever noble purpose', '2026-03-07',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo school admission certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-005', 'Rose Ann P. Dela Cruz',
     'Barangay Lutao, Bacong, Negros Oriental', 'Woman',
     'whatever noble purpose', '2026-03-22',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo travel documentation certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-006', 'Mark Anthony S. Lim',
     'Barangay Buntis, Bacong, Negros Oriental', 'Man',
     'whatever noble purpose', '2026-04-11',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo civil service certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-007', 'Joanna F. Mercado',
     'Barangay Timbanga, Bacong, Negros Oriental', 'Woman',
     'whatever noble purpose', '2026-05-09',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo board examination certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-008', 'Paolo G. Navarro',
     'Barangay Banilad, Bacong, Negros Oriental', 'Man',
     'whatever noble purpose', '2026-06-14',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo local employment certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-009', 'Cristina L. Aquino',
     'Barangay Isugan, Bacong, Negros Oriental', 'Woman',
     'whatever noble purpose', '2026-07-20',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo volunteer service certificate.', 'mysql-seeder', NOW(), NOW()),

    ('GMC-DEMO-010', 'Rafael D. Mendoza',
     'Barangay Calangag, Bacong, Negros Oriental', 'Man',
     'whatever noble purpose', '2026-08-28',
     'Rev. Msgr. Glenn M. Corsiga, PC VG', 'Parish Priest',
     'Demo overseas employment certificate.', 'mysql-seeder', NOW(), NOW());

-- Expected result after the first run: 10 GMC-DEMO records.
SELECT COUNT(*) AS seeded_good_moral_records
FROM good_moral_records
WHERE protocol_no LIKE 'GMC-DEMO-%';

