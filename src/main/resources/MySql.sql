USE czstest;

DROP TABLE
IF EXISTS `test`;
CREATE TABLE `test` (
  `tdate`      DATE           DEFAULT NULL,
  `tdatetime`  DATETIME       DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `tdouble`    DOUBLE         DEFAULT NULL,
  `tnumber`    INT(11)        DEFAULT NULL,
  `tblob`      BLOB,
  `tlongblob`  LONGBLOB,
  `ttimestamp` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8;

INSERT INTO `test`
VALUES
  (
    '2019-02-21',
    '2019-02-24 21:15:06',
    '3.3',
    '3',
    0x31626C6F62,
    0x31326C6F6E67626C6F62,
    '2019-02-24 21:15:06'
  );

DROP PROCEDURE
IF EXISTS `select_one`;

CREATE PROCEDURE select_one(
  IN cdatetime  DATETIME,
  IN cdate      DATE,
  IN cdouble    DOUBLE,
  IN cint       INT,
  IN cblob      BLOB,
  IN clongblob  LONGBLOB,
  IN ctimestamp TIMESTAMP
)
  BEGIN
    SELECT *
    FROM
      test
    WHERE
      tnumber = cint
      AND tdate = cdate
      AND tdatetime = cdatetime
      AND tdouble = cdouble
      AND tblob = cblob
      AND tlongblob = clongblob
      AND ttimestamp = ctimestamp;


  END;

DROP PROCEDURE
IF EXISTS `insert_one`;

CREATE PROCEDURE insert_one(
  IN cdate      DATE,
  IN cdatetime  DATETIME,
  IN cdouble    DOUBLE,
  IN cnumber    INT,
  IN cblob      BLOB,
  IN clongblob  LONGBLOB,
  IN ctimestamp TIMESTAMP
)
  BEGIN
    INSERT INTO test (
      tdate,
      tdatetime,
      tdouble,
      tnumber,
      tblob,
      tlongblob,
      ttimestamp
    )
    VALUES
      (
        cdate,
        cdatetime,
        cdouble,
        cnumber,
        cblob,
        clongblob,
        ctimestamp
      );

    SELECT *
    FROM
      test
    WHERE
      tdatetime = cdatetime;


  END;

