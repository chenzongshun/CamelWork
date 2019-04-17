-- 完成

-- 元数据表
-- DE05.10.019.00	儿童死前治疗类别代码	儿童死亡前接受治疗情况在特定分类中的代码	S3	N1	1.住院治疗 2.门诊治疗 3.未治疗
INSERT INTO `esb_cfg_metadata` (`code`, `type_id`, `name`, `data_type`, `data_format`, `dict_code`, `constraint`, `min_length`, `max_length`, `rows`, `precision`, `des`, `createtime`, `updatetime`, `maintain_user`)
VALUES ('DE05.10.019.00', 10, '儿童死前治疗类别代码', 'S3', 'N1', 'DE05.10.019.00', NULL, 0, 0, 1, 0, '儿童死亡前接受治疗情况在特定分类中的代码', '2019-04-11 18:41:24', NULL, '涂荣范');

-- DE05.10.080.00	现存主要健康问题代码	曾经出现或一直存在，并影响目前身体健康状况的疾病在特定编码体系中的代码	S3	AN..5	ICD-10
-- DE05.10.118.00	重性精神疾病患者随访评价结果代码	随访医师对重性精神疾病患者进行医学随访的评价结果在特定分类中的代码	S3	N1	1.不稳定 2.基本稳定 3.稳定
INSERT INTO `esb_cfg_metadata` (`code`, `type_id`, `name`, `data_type`, `data_format`, `dict_code`, `constraint`, `min_length`, `max_length`, `rows`, `precision`, `des`, `createtime`, `updatetime`, `maintain_user`)
VALUES ('DE05.10.118.00', 10, '重性精神疾病患者随访评价结果代码', 'S3', 'N1', 'DE05.10.118.00', NULL, 0, 0, 1, 0, '随访医师对重性精神疾病患者进行医学随访的评价结果在特定分类中的代码', '2019-04-11 18:41:24', '2019-04-12 16:01:58', '陈宗顺');


-- 字典表
-- DE05.10.019.00	儿童死前治疗类别代码	儿童死亡前接受治疗情况在特定分类中的代码	S3	N1	1.住院治疗 2.门诊治疗 3.未治疗
INSERT INTO `esb_cfg_dictionary` (`id`, `name`, `code`, `parent`, `is_dir`, `desc`, `createtime`, `modifytime`, `operator`)
VALUES (199, '儿童死前治疗类别代码', 'DE05.10.019.00', 10, '0', '儿童死亡前接受治疗情况在特定分类中的代码', '2019-04-12 15:56:42', '2019-04-12 15:56:42', '陈宗顺');

-- DE05.10.080.00	现存主要健康问题代码	曾经出现或一直存在，并影响目前身体健康状况的疾病在特定编码体系中的代码	S3	AN..5	ICD-10
-- DE05.10.118.00	重性精神疾病患者随访评价结果代码	随访医师对重性精神疾病患者进行医学随访的评价结果在特定分类中的代码	S3	N1	1.不稳定 2.基本稳定 3.稳定
INSERT INTO `esb_cfg_dictionary` (`id`, `name`, `code`, `parent`, `is_dir`, `desc`, `createtime`, `modifytime`, `operator`)
VALUES (493, '重性精神疾病患者随访评价结果代码', 'DE05.10.118.00', 10, '0', '随访医师对重性精神疾病患者进行医学随访的评价结果在特定分类中的代码', '2019-04-12 15:56:42', '2019-04-12 15:56:42', '陈宗顺');


-- 字典表项
-- DE05.10.019.00	儿童死前治疗类别代码	儿童死亡前接受治疗情况在特定分类中的代码	S3	N1	1.住院治疗 2.门诊治疗 3.未治疗
INSERT INTO `esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `desc1`, `desc2`, `parent_dic_item`, `createtime`, `modifytime`, `operator`)
VALUES
  (199, '1', '住院治疗', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (199, '2', '门诊治疗', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (199, '3', '未治疗', NULL, NULL, 0, NOW(), NOW(), '陈宗顺')
;

-- DE05.10.080.00	现存主要健康问题代码	曾经出现或一直存在，并影响目前身体健康状况的疾病在特定编码体系中的代码	S3	AN..5	ICD-10
-- DE05.10.118.00	重性精神疾病患者随访评价结果代码	随访医师对重性精神疾病患者进行医学随访的评价结果在特定分类中的代码	S3	N1	1.不稳定 2.基本稳定 3.稳定
INSERT INTO `esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `desc1`, `desc2`, `parent_dic_item`, `createtime`, `modifytime`, `operator`)
VALUES
  (493, '1', '不稳定', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (493, '2', '基本稳定', NULL, NULL, 0, NOW(), NOW(), '陈宗顺'),
  (493, '3', '稳定', NULL, NULL, 0, NOW(), NOW(), '陈宗顺')

