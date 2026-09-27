-- Certificate of Good Moral Character records
-- Apply this migration to each SPIRES parish database before opening the module.

CREATE TABLE IF NOT EXISTS good_moral_records (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    protocol_no VARCHAR(50) NOT NULL,
    person_name VARCHAR(255) NOT NULL,
    residence VARCHAR(500) NOT NULL,
    sex VARCHAR(20) NOT NULL,
    purpose VARCHAR(500) NOT NULL,
    issued_on DATE NOT NULL,
    signing_priest VARCHAR(255) NOT NULL,
    priest_designation VARCHAR(100) NOT NULL,
    remarks TEXT NULL,
    created_by VARCHAR(100) NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY uq_good_moral_protocol_no (protocol_no),
    KEY idx_good_moral_person_name (person_name),
    KEY idx_good_moral_issued_on (issued_on)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
