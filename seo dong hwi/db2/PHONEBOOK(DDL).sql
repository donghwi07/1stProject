--DDL--
CREATE TABLE phoneInfo_basic(
idx NUMBER(6) NOT NULL, 
fr_name VARCHAR2(20) NOT NULL, 
fr_phonenumber VARCHAR2(20) NOT NULL, 
fr_email VARCHAR2(20), 
fr_address VARCHAR2(20), 
fr_redate DATE DEFAULT SYSDATE,
CONSTRAINT phoneInfo_basic_idx_PK PRIMARY KEY(idx)
);

CREATE TABLE phoneInfo_univ(
idx NUMBER(6) NOT NULL,
fr_u_major VARCHAR2(20) DEFAULT 'N' NOT NULL,
fr_u_year NUMBER(1) DEFAULT '1',
fr_ref NUMBER(7) NOT NULL,
CONSTRAINT phoneInfo_univ_idx_PK PRIMARY KEY(idx),
CONSTRAINT phoneInfo_univ_fr_ref_FK FOREIGN KEY(fr_ref) REFERENCES phoneInfo_basic(idx),
CONSTRAINT phoneInfo_univ_fr_u_year_CK CHECK(fr_u_year BETWEEN 1 and 4)
);

CREATE TABLE phoneInfo_com(
idx NUMBER(6) NOT NULL,
fr_c_company VARCHAR2(20) DEFAULT 'N' NOT NULL,
fr_ref NUMBER(6) NOT NULL, 
CONSTRAINT phoneInfo_com_idx_PK PRIMARY KEY(idx),
CONSTRAINT phoneInfo_com_fr_ref_FK FOREIGN KEY(fr_ref) REFERENCES phoneInfo_basic(idx)
);