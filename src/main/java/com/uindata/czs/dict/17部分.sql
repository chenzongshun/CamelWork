-- 完成

-- 元数据表
-- 卫生信息数据元目录第17部分 卫生管理    【通知到达人与新生儿关系】
INSERT INTO `esb_cfg_metadata` (`code`, `type_id`, `name`, `data_type`, `data_format`, `dict_code`, `constraint`, `min_length`, `max_length`, `rows`, `precision`, `des`, `createtime`, `updatetime`, `maintain_user`)
VALUES
  ('DE09.00.054.00', 16, '通知到达人与新生儿关系', 'S3', 'N2', 'GB/T_4761-2008', NULL, 0, 0, 1, 0, '通知到达人与新生儿家庭和社会关系类别在特定编码体系中的代码',
   '2019-04-11 14:45:17', '2019-04-11 14:45:18', '陈宗顺');


-- 字典表
-- 卫生信息数据元目录第17部分 卫生管理    【通知到达人与新生儿关系】
INSERT INTO `esb_cfg_dictionary` (`id`, `name`, `code`, `parent`, `is_dir`, `desc`, `createtime`, `modifytime`, `operator`)
VALUES (42, '家庭关系代码', 'GB/T_4761-2008', 16, '0', '家庭和社会关系类别在特定编码体系中的代码', '2019-04-11 15:37:01', '2019-04-11 15:37:02',
        '陈宗顺');


-- 字典表项
-- 卫生信息数据元目录第17部分 卫生管理    【通知到达人与新生儿关系】
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '01', '本人', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '02', '户主', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '10', '配偶', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '11', '夫', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '12', '妻', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '20', '子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '21', '独生子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '22', '长子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '23', '次子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '24', '三子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '25', '四子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '26', '五子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '27', '养子或继子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '28', '女婿', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '29', '其他儿子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '30', '女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '31', '独生女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '32', '长女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '33', '次女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '34', '三女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '35', '四女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '36', '五女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '37', '养女或继女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '38', '儿媳', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '39', '其他女儿', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '40', '孙子、孙女或外孙子、外孙女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '41', '孙子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '42', '孙女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '43', '外孙子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '44', '外孙女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '45', '孙媳妇或外孙媳妇', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '46', '孙女婿或外孙女婿', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '47', '曾孙子或外曾孙子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '48', '曾孙女或外曾孙女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '49', '其他孙子、孙女或外孙子、外孙女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '50', '父母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '51', '父亲', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '52', '母亲', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '53', '公公', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '54', '婆婆', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '55', '岳父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '56', '岳母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '57', '继父或养父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '58', '继母或养母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '59', '其他父母关系', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '50', '袓父母或外祖父母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '61', '祖父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '62', '袓母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '63', '外祖父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '64', '外祖母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '65', '配偶的祖父母或外祖父母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '66', '曾祖父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '67', '曾祖母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '68', '配偶的曾祖父母或外曾祖父母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '69', '其他祖父母或外祖父母关系', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '70', '兄弟姐妹', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '71', '兄', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '72', '嫂', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '73', '弟', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '74', '弟媳', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '75', '姐姐', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '76', '姐夫', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '77', '妹妹', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '78', '妹夫', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '79', '其他兄弟姐妹', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '80', '其他', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '81', '伯父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '82', '伯母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '83', '叔父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '84', '婶母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '85', '舅父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '86', '舅母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '87', '姨父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '88', '姨母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '89', '姑父', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '90', '姑母', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '91', '堂兄弟、堂蛆妹', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '92', '表兄弟、表姐妹', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '93', '侄子', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '94', '侄女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '95', '外甥', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '96', '外甥女', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '97', '其他亲属', '2019-04-11 17:59:27', '陈宗顺');
INSERT INTO `mdipesb`.`esb_cfg_dictionary_item` (`dic_id`, `value`, `desc`, `createtime`, `operator`) VALUES (42, '99', '非亲属', '2019-04-11 17:59:27', '陈宗顺');