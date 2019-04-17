="INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (1, '"&C3&"', '"&D3&"', '"&A3&"', '"&B3&"', 1, NULL, NULL);"

1	病历概要基本数据集
1.1	患者基本信息子集
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (1, '城乡居民健康档案编号', '城乡居民个人健康档案的编号', 'HDSD00.02.003', 'DE01.00.009.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (2, '患者身份证件号码', '患者的身份证件上的唯一法定标识符', 'HDSD00,02.025', 'DE02.01.030.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (3, '身份证件类别代码', '患者身份证件所属类别在特定编码体系中的代码', 'HDSD00.02.026', 'DE02.01.031.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (4, '居民健康卡号', '患者持有的全国统一的居民健康卡的编号', 'HDSDOO.02.035', 'DE01.00.021.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (5, '医疗保险类别代码', '患者本人参加的医疗保险类别在特定编码体系中的代码', 'HD9D00.02.052', 'DE02.01.044.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (6, '患者姓名', '患者本人在公安户籍管理部门正式登记注册的姓氏和名称', 'HDSD00.02.027', 'DE02.01.039.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (7, '出生日期', '患者出生当日的公元纪年日期的完整描述', 'HDSD00.02.004', 'DE02.01.005.01', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (8, '性别代码', '患者生理性别在特定编码体系中的代码', 'HDSD00.02.050', 'DE02.01.040.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (9, '婚姻状况代码', '患者当前婚姻状况在特定编码体系中的代码', 'HDSD00.02.028', 'DE02.01.018.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (10, '民族', '患者所属民族在特定编码体系中的代码', 'HDSD00.02.042', 'DE02.01.025.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (11, '职业类别代码', '患者当前从事的职业类别在特定编码体系中的代码', 'HDSD00.02.060', 'DE02.01.052.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (12, '工作单位名称', '患者所在的工作单位名称', 'HDSD00.02.019', 'DE02.01.004.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (13, '工作单位电话号码', '患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号', 'HDSD00.02.018', 'DE02.01.010.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (14, '地址类别代码', '患者本人或联系人地址类别在特定编码体系中的代码', 'HDSD00.02.008', 'DE02.01.024.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (15, '地址-省（自治区、直辖市）', '患者本人或联系人地址中的省、自治区或直辖市名称', 'HDSD00.02.010', 'DE02.01.009.01', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (16, '地址-市（地区、州）', '患者本人或联系人地址中的市、地区或州的名称', 'HDSD00.02.011', 'DE02.01.009.02', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (17, '地址-县（区）', '患者本人或联系人地址中的县（区）的名称', 'HDSD00.02.012', 'DE02.01.009.03', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (18, '地址-乡（镇、街道办事处）', '患者本人或联系人地址中的乡、镇或城市的街道办事处名称', 'HDSDOO,02.013', 'DE02.01.009.04', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (19, '地址-村(街、路、弄等）', '患者本人或联系人地址中的村或城市的街、路、里、弄等名称', 'HDSD00.02.007', 'DE02.01.009.05', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (20, '地址-门牌号码', '患者本人或联系人地址中的门牌号码', 'HDSD00.02.009', 'DE02.01.009.06', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (21, '邮政编码', '由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号', 'HDSD00.02.056', 'DE02.01.047.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (22, '患者电话号码', '患者本人的电话号码，包括国际、国内区号和分机号', 'HDSD00.02.023', 'DE02.01.010.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (23, '联系人姓名', '联系人在公安户籍管理部门正式登记注册的姓氏和名称', 'HDSD00.02.039', 'DE02.01.039.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (24, '联系人电话号码', '联系人的电话号码，包括国际、国内区号和分机号', 'HDSD00.02.038', 'DE02.01.010.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (25, '建档日期时间', '患者电子病历初次建档完成吋的公元纪年R期和时间的完整描述', 'HDSD00.02.032', 'DE06.00.218.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (26, '建档医疗机构组织机构', '建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码', 'HDSD00.02.033', 'DE08.10.052.00', 1, NULL, NULL);
    INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (27, '建档者姓名', '首次为患者建立电子病历的人员在公安户籍管理部门正式登记注册的姓氏和名称', 'HDSD00.02.034', 'DE02.01.039.00', 1, NULL, NULL);

1.2	基本健康信息子集
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '居民健康卡号', '患者持有的全国统一的居民健康卡的编号','HDSD00.02.035','DE01.00.021.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( 'ABO血型代码', '进行血型检査明确，或既往病历资料能够明确的患者ABO血型类别在特定编码体系中的代码','HDSDOO.02.001','DE04.50.001.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( 'Rh血型代码', '进行血型检查明确，或既往病历资料能够明确的患者Rh血型的类别代码','HDSD00.02.002','DE04.50.010.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '疾病史(含外伤）', '患者既往健康状况和疾病（含外伤）的详细描述','HDSD00.02.030','DE02.10.026.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '传染病史', '患者既往所患各种急性或慢性传染性疾病名称的详细描述','HDSDOO.02.006','DE02.10.008.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '预防接种史', '患者预防接种情况的详细描述','HDSD00.02.057','DE02.10.101.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '手术史', '患者既往接受手术/操作经历的详细描述','HDSDOO.02.047','DE02.10.061.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '输血史', '患者既往输血史的详细描述','HDSD00.02.048','DE02.10.100.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '过敏史', '患者既往发生过敏情况的详细描述','HDSDOO.02.022','DE02.10.022.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '个人史', '患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述','HDSD00.02.016','DE02.10.097.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '婚育史', '患者婚育史的详细描述','HDSD00.02.029','DE02.10.098.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '月经史', '患者月经史的详细描述','HDSD00.02.058','DE02.10.102.00',1,NULL,NULL);
    INSERT INTO `esb_cfg_dataset_column` ( `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES ( '家族史', '患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述','HDSD00.02.031','DE02.10.103.00',1,NULL,NULL);

1.3	卫生事件摘要子集
1.4	医疗费用记录子集

2	门（急）诊病历基本数据集
2.1	门（急）诊病历子集
2.2	急诊留观病历子集
3	门（急)诊处方基本数据集
3.1	西药处方子集
3.2	中药处方子集
4	检查检验记录基本数据集
4.1	检查记录子集
4.2	检验记录子集
5	一般治疗处置记录基本数据集
5.1	治疗记录子集
5.2	—般手术记录子集
5.3	麻醉术前访视记录子集
5.4	麻醉记录子集
5.5	麻醉术后访视记录子集
5.6	输血记录子集
6	助产记录基本数据集
6.1	待产记录子集
6.2	阴道分娩记录子集
6.3	剖宫产手术记录子集
7	护理操作记录基本数据集
7.1	一般护理记录子集
7.2	病危（重）护理记录子集
7.3	手术护理记录子集
7.4	生命体征测量记录子集
7.5	出入量记录子集
7.6	高值耗材使用记录子集
8	护理评估与计划基本数据集
8.1	入院评估记录子集
8.2	护理计划记录子集
8.3	出院评估与指导记录子集
9	知情告知信息
9.1	手术同意书子集
9.2	麻醉知情同意书子集
9.3	输血治疗同意书子集
9.4	特殊检查及特殊治疗同意书子集
9.5	病危（重）通知书子集
9.6	其他知情同意书子集
10	住院病案首页
10.1	住院病案首页子集
11	中医住院病案首页
11.1	中医住院病案首页子集
12	入院记录
12.1	入院记录子集
12.2	 24 h内人出院记录子集
12.3	24 h内人院死亡记录子集
13	住院病程记录
13.1	首次病程记录子集
13.2	日常病程记录子集
13.3	上级医师查房记录子集
13.4	疑难病例讨论子集
13.5	交接班记录子集
13.6	转科记录子集
13.7	阶段小结子集
13.8	抢救记录子集
13.9	会诊记录子集
13.1	术前小结子集
13.11	术前讨论子集
13.12	术后首次病程记录子集
13.13	出院记录子集
13.14	死亡记录子集
13.15	死亡病例讨论记录子集
14	住院医嘱
14.1	住院医嘱子集
15	出院小结
15.1	出院小结记录子集
16	转诊（院）记录
16.1	转诊（院）记录子集
17	医疗机构信息
17.1	医疗机构子集



="INSERT INTO `esb_cfg_dataset_column` (`id`, `name`, `desc`, `inner_symbol`, `metadata_code`, `theme_id`, `createtime`, `modifytime`) VALUES (1, '"&C3&"', '"&D3&"', '"&A3&"', '"&B3&"', 1, NULL, NULL);"


