DROP TABLE czstesttable; --删除表
CREATE TABLE czstesttable (--创建表
  tdate      DATE,
  tdatetime  DATETIME,
  tdouble    FLOAT,
  tnumeric   NUMERIC(18),
  tbinary    BINARY(1),
  ttext      TEXT,
  ttimestamp TIMESTAMP NOT NULL
) GO DECLARE @sn NVARCHAR(30) SET @sn = schema_name() EXECUTE sp_addextendedproperty N'MS_Description', N'宗顺测试',
  N'SCHEMA', @sn, N'TABLE',
  N'czstesttable' GO ;

--插入数据测试
INSERT INTO czstesttable VALUES ('2019-02-26', '2019-02-26 13:34:59', 1.1, 1, 22, 'text', DEFAULT);

--存储过程如果存在了就删除
IF exists(SELECT *
FROM sysobjects
WHERE id = object_id('insertIntoCzstesttable') AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
DROP PROCEDURE insertIntoCzstesttable
GO

--创建存储过程
CREATE PROCEDURE insertIntoCzstesttable(@cdate    DATE, @cdatetime DATETIME, @cdouble DOUBLE PRECISION,
                                        @cnumeric NUMERIC, @cbinary BINARY,
                                        @ctext    TEXT) AS BEGIN INSERT INTO czstesttable (tdate, tdatetime, tdouble, tnumeric, tbinary, ttext)
VALUES (@cdate, @cdatetime, @cdouble, @cnumeric, @cbinary, @ctext);
SELECT TOP 1 *
FROM czstesttable
ORDER BY tdatetime DESC;
END GO