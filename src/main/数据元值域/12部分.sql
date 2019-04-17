-- 完成

-- 元数据表
-- DE06.00.051.00	健康指导代码	根据受检者的体检结果提出健康指导建议在特定分类中的代码	S3	N1	1.纳入慢性病患者健康管理 2.建议复检 3.建议转诊
INSERT INTO `esb_cfg_metadata` (`code`, `type_id`, `name`, `data_type`, `data_format`, `dict_code`, `constraint`, `min_length`, `max_length`, `rows`, `precision`, `des`, `createtime`, `updatetime`, `maintain_user`)
VALUES ('DE06.00.051.00', 11, '健康指导代码', 'S3', 'N1', 'DE06.00.051.00', NULL, 0, 0, 1, 0, '根据受检者的体检结果提出健康指导建议在特定分类中的代码', '2019-04-11 18:41:24', '2019-04-12 14:23:39', '陈宗顺');

-- DE06.00.093.00	手术/操作代码	按照《国际疾病分类 临床修订版ICD-9-CM》手术/操作的分类代码	S3	AN..5	ICD-9-CM


-- 字典表
-- DE06.00.051.00	健康指导代码	根据受检者的体检结果提出健康指导建议在特定分类中的代码	S3	N1	1.纳入慢性病患者健康管理 2.建议复检 3.建议转诊
INSERT INTO `esb_cfg_dictionary` (`id`, `name`, `code`, `parent`, `is_dir`, `desc`, `createtime`, `modifytime`, `operator`)
VALUES (198, '经济类型代码', 'DE06.00.051.00', 11, '0', '根据受检者的体检结果提出健康指导建议在特定分类中的代码',  NOW(), NOW(), '陈宗顺');

-- DE06.00.093.00	手术/操作代码	按照《国际疾病分类 临床修订版ICD-9-CM》手术/操作的分类代码	S3	AN..5	ICD-9-CM


-- 字典表项
-- DE06.00.051.00	健康指导代码	根据受检者的体检结果提出健康指导建议在特定分类中的代码	S3	N1	1.纳入慢性病患者健康管理 2.建议复检 3.建议转诊
INSERT INTO `esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `desc1`, `desc2`, `parent_dic_item`, `createtime`, `modifytime`, `operator`)
VALUES
  (198, '1', '纳入慢性病患者健康管理', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (198, '2', '建议复检', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (198, '3', '建议转诊', NULL, NULL, 0, NOW(), NOW(), '陈宗顺')
;

-- DE06.00.093.00	手术/操作代码	按照《国际疾病分类 临床修订版ICD-9-CM》手术/操作的分类代码	S3	AN..5	ICD-9-CM

