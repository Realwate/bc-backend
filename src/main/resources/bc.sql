/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : bc

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-03-18 16:39:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bc_config`
-- ----------------------------
DROP TABLE IF EXISTS `bc_config`;
CREATE TABLE `bc_config` (
  `uploaddir` varchar(255) NOT NULL,
  `id` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_config
-- ----------------------------
INSERT INTO `bc_config` VALUES ('C:/upload', '1');

-- ----------------------------
-- Table structure for `document`
-- ----------------------------
DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
  `id` varchar(32) NOT NULL,
  `overview` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `nodeId` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of document
-- ----------------------------
INSERT INTO `document` VALUES ('0157f8682f084c80ba04f1bfa8684de8', null, null, '40449b9e39f0418fa1d662b876c4132f');
INSERT INTO `document` VALUES ('01a789d2a8764ee39c2a921f410b4719', null, null, '1b811180c5314b349bce9aa34541f385');
INSERT INTO `document` VALUES ('0ba8b1df593646fbb6ed0de49e96fa45', null, null, 'f7b29f60f0d644678695fc71851c96ac');
INSERT INTO `document` VALUES ('1015e5f068314635b4e57e03fe633a15', null, null, 'cb143e24df2945a7af7e3a0a879cb6cf');
INSERT INTO `document` VALUES ('1153467baf48466ca816284e04edf964', null, null, '65bbecf0d9104588bae28b1ad6388882');
INSERT INTO `document` VALUES ('11fe50522f15425dbb76ae8039536953', null, null, '0c07ae17fe25402b95da4200ccc4e35f');
INSERT INTO `document` VALUES ('129c3b99df0443f99c00bad21bc6b2ea', null, null, 'bfa675973a3341318ded57d073afcc56');
INSERT INTO `document` VALUES ('1aad7512e4414352914b26c3d87e98c2', null, null, 'c35b8d1bd58346519444a40e7d8fc8ca');
INSERT INTO `document` VALUES ('1be242315aed4c82bd9ebfd79cefb7b7', null, null, '0b47ca1a41ec4b39ae7a33491f457929');
INSERT INTO `document` VALUES ('248ccbd102b6428bad2e011859817440', null, null, 'ac0ce567202a429980df39ce977d1722');
INSERT INTO `document` VALUES ('2665f75829be42f5ade204c8f066d6f8', null, null, '184ac5c28bd6492ca13ba4ba8fb22df1');
INSERT INTO `document` VALUES ('2fed30f290934a0d8554c84cc6db5101', null, null, '2a356391b2cf48e3b530da2f5604c5d5');
INSERT INTO `document` VALUES ('31aeaf04990042a2b0e1449b737ac42c', null, null, '8fc126a997e04de7a3930aea374e8d95');
INSERT INTO `document` VALUES ('33a929afb5f748b5afb99b5fdd5e9c89', null, null, '59dd3fd81b804508bac410e1dcc981e9');
INSERT INTO `document` VALUES ('3915f0f168eb4a5bb61d2529bdd3c1ab', null, null, 'a4b05d4c09184d248f1192bfd5b3829a');
INSERT INTO `document` VALUES ('4303950c4ea14a8f84b14e86bb07b548', null, null, 'ca33d970cbbd4a439516cd7a60a682c8');
INSERT INTO `document` VALUES ('4a04429205754e2d9aef8a610c803c63', null, null, 'faed15dd9928431d9bd1f036ad4eea65');
INSERT INTO `document` VALUES ('5008a77d37d04cde929264907fa70d4c', null, null, '2bc6c9b235bf411a9a1dd0968058bda2');
INSERT INTO `document` VALUES ('5462fcefcc2f411bb55375e2c7593482', null, null, '9f01307fdd1846a4a9fc1b9b52bfb1a4');
INSERT INTO `document` VALUES ('5883ef65f0334956bf76f20081f3d86b', null, null, '41614a87de8f4e3e885974f6ddcfcde7');
INSERT INTO `document` VALUES ('5ae615ab82294c94ad3e4027d030cbb8', null, null, '24cf3bbb5cea490ca5627a3450d7ea7d');
INSERT INTO `document` VALUES ('5d9b2a42928b4ab8b06cd8e5981ec446', null, null, '8ef73f3f30eb4da8b147a91e47c84889');
INSERT INTO `document` VALUES ('60d6ce65cca9462896ac31e23d72af0d', null, null, 'ceab3218fb09445c95a7ac3ae8e22cb9');
INSERT INTO `document` VALUES ('611bc2db5bda4625888f1d51fff59b88', null, null, '003e5fc2f327445dad8f7730115fdada');
INSERT INTO `document` VALUES ('66cedb8658284c7c916112997b44f422', null, null, '370afdf151ad4c1d91d91304127074ea');
INSERT INTO `document` VALUES ('6cba2649f67c40b088bebc6cc2484ff2', null, null, '78e0b861086e482ca16c5c23f5ac77c6');
INSERT INTO `document` VALUES ('6ea778e2fb08410ea005a5ec536c850e', null, null, '0d724ab4262643449a2c98562436cf6a');
INSERT INTO `document` VALUES ('7047b22dedeb40f3a1d980977611ef6c', null, null, '40a38d4c2c544685bac01babb3c71a09');
INSERT INTO `document` VALUES ('72c6cefb02d44dba94586486eeed2e88', null, null, '833f9c17ff55418cb14370d62dc774e3');
INSERT INTO `document` VALUES ('73c3192ef8584d7abc2792923d63f9c0', null, null, '3668a1649e2b4b9c93a3a8359a679457');
INSERT INTO `document` VALUES ('7764336d6c4441f0b6a635527aaad28b', null, null, 'b844ee7208294b269c5a1e21d397eb0e');
INSERT INTO `document` VALUES ('85392d66f8444aa08682c80b69d18683', null, null, '20fbe261a2944203b5d5a709ce8082dd');
INSERT INTO `document` VALUES ('93324fe94f614fdca2581d1977768bf6', null, null, 'd1452ce827754727ac1f211dd0a207cf');
INSERT INTO `document` VALUES ('933771f0abb5420c80023a18e7692e51', null, null, '65a363f19ab54411a7d2a31e2aa3ba32');
INSERT INTO `document` VALUES ('98044a30faf54e75b5909ec2695b699c', null, null, '83abb81b4fc840b49df052fb8b04f613');
INSERT INTO `document` VALUES ('9964b02f2b5f45508fe3a5d7a2783964', null, null, 'b3c8a207ef5a42a388988c24dbebcf1e');
INSERT INTO `document` VALUES ('9b6aba2f0b4640eb8d2a22e04415b580', null, null, '09caf6ff09ac48d491d9bf936cba7d07');
INSERT INTO `document` VALUES ('9fd12af0d4b54db4aaaa1b52653e00ba', null, null, '76ec8094cb3f4bc5adff7c5ea9e832e0');
INSERT INTO `document` VALUES ('a1439b1f0e084f4e9891322a0474c3c8', null, null, '9947e93bf57f4a88a2275606e4fd9c8a');
INSERT INTO `document` VALUES ('a1e5b5f4124a4b668cecfd788fa2f234', null, null, 'c8a53928eeb945469c01ea5c89fff317');
INSERT INTO `document` VALUES ('a4787fecee6d40ff8977958be3c4565a', null, null, '52c124c5f4cc41289dd91623adf1d22c');
INSERT INTO `document` VALUES ('a99bf278c9eb4243a5ae7c8ad779a361', null, null, '73ff0f4a778d47c3bc301d7ab607b3d7');
INSERT INTO `document` VALUES ('aadecb3ce1804ba999409dd4740b1ce1', null, null, '81778f41a34841c0ac14ff520e65b03d');
INSERT INTO `document` VALUES ('ac8ddedc926c4d5a9e206900245b6675', null, null, 'fe60759d80ee4fd9a055d68c7b555e20');
INSERT INTO `document` VALUES ('ad82d07a3bf44c4bb2b07b1b52d57a6d', null, null, '3d6320d9750841ae999c87ab4923a150');
INSERT INTO `document` VALUES ('b11f8c65468e45748fe7c579f38a07f8', null, null, 'b7005f3f712741269c6ea87d257317ae');
INSERT INTO `document` VALUES ('b915d5131f7a48af88fe75e6a3ee65ba', null, null, '1ac0d5f756254afa9a5ebe14ea3e21a5');
INSERT INTO `document` VALUES ('bb234c06465c420986223368ca93e996', null, null, 'f93c9b4866c14052987f669b36aecbec');
INSERT INTO `document` VALUES ('c073d61c171c4f7fa5b244621d0ddbd0', null, null, 'd9a0adaba1044e73b60c88e52e53b3fd');
INSERT INTO `document` VALUES ('c1f9da746d934af8a8b57eef2d17402f', null, null, 'db79c6657262480288858e97399259c9');
INSERT INTO `document` VALUES ('c39e478e533e4296b66dbbad1764f4d2', null, null, '61d4e04b6ea74cdc84e70eaeadd8c8df');
INSERT INTO `document` VALUES ('cb2cf66ce0db4347b226c0a511faf344', null, null, 'fa292ac7a607421d8ca13fa73399707b');
INSERT INTO `document` VALUES ('cc737080e4254d8aaec9d5962797763d', null, null, 'adb48c3eb09740eaa21dea4ec59ee613');
INSERT INTO `document` VALUES ('d0948544584c46319396d296a04b20af', null, null, '590748ba857d4ee785a829d3401fa6a8');
INSERT INTO `document` VALUES ('d796bf76aca648da95bc1a73abaa2fea', null, null, 'a272d26f984a422ebb3899ffbead3825');
INSERT INTO `document` VALUES ('e1315b84a07140d3a56ae075cb011730', null, null, 'c37098a0e7be4f6aa4bf49937b40260b');
INSERT INTO `document` VALUES ('e311ccbcfd0448859697b40b61f50233', null, null, '8f434506bff1493d8cbc5e40aa5a0781');
INSERT INTO `document` VALUES ('e9023f4ebb10458581be87233da3c358', null, null, 'b578f4e0a01842ae9b515c6ce10e352f');
INSERT INTO `document` VALUES ('ed325369ad954feabaf10ee73b3c22e5', null, null, '90056a641dd84752ae9e5f2011630ac3');
INSERT INTO `document` VALUES ('f1ec063afffa4a698ac9fe63c4c1ab2f', null, null, 'dbad50f34e0a402890f03984adae5973');
INSERT INTO `document` VALUES ('f23d8156a78146039be8ba59d8738e7c', null, null, '3083cc3d63f4461e963444f142dee971');
INSERT INTO `document` VALUES ('f2e1d9d0c3764788882177a501f05fb2', null, null, '870522dd296049b495c7d2924c7ed680');
INSERT INTO `document` VALUES ('f59b46777bb94942882cd3d10e104a37', null, null, '881d06fab4f14ac481ca5c460589b0cd');
INSERT INTO `document` VALUES ('fc0c703df699499baef6a8d5f85de41e', null, null, '82755a2601b645c188f0fc0f92d4b0e0');
INSERT INTO `document` VALUES ('fe13d4a8843d44508e63bc1a0ca06dc4', null, null, '4f9426cbedd2486c8d33ec354b7febf6');

-- ----------------------------
-- Table structure for `fileentity`
-- ----------------------------
DROP TABLE IF EXISTS `fileentity`;
CREATE TABLE `fileentity` (
  `id` varchar(32) NOT NULL,
  `path` varchar(255) NOT NULL,
  `fileName` varchar(255) DEFAULT NULL,
  `documentId` varchar(32) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileentity
-- ----------------------------

-- ----------------------------
-- Table structure for `node`
-- ----------------------------
DROP TABLE IF EXISTS `node`;
CREATE TABLE `node` (
  `id` varchar(32) NOT NULL,
  `parentid` varchar(32) DEFAULT NULL,
  `label` varchar(255) NOT NULL,
  `productid` int(11) NOT NULL,
  `nodelevel` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of node
-- ----------------------------
INSERT INTO `node` VALUES ('003e5fc2f327445dad8f7730115fdada', 'c8229b3d7817420eb058eee37fd217bb', '客商', '2', '3');
INSERT INTO `node` VALUES ('0471b7ac9e044b9f90a069d2792f22ec', '292067a3b80c43e1b54d8b9d94cb26cb', '-', '2', '2');
INSERT INTO `node` VALUES ('07c49a04bf3a41a6a3fd464ec0369c1b', '3d640dcc23e548fb87003fc34d85cd2b', '角色管理', '3', '2');
INSERT INTO `node` VALUES ('09caf6ff09ac48d491d9bf936cba7d07', 'ef1de60a9f3b4ae98ad20783f88f2128', '待处理用户', '3', '3');
INSERT INTO `node` VALUES ('0b47ca1a41ec4b39ae7a33491f457929', '96a31fb94ba84b1ab2c940c58d828bf2', '预警条目配置-业务单元', '3', '3');
INSERT INTO `node` VALUES ('0c07ae17fe25402b95da4200ccc4e35f', 'c8229b3d7817420eb058eee37fd217bb', '用户定义属性设置', '2', '3');
INSERT INTO `node` VALUES ('0ecdc22853d349cca975d0ef59428424', null, 'ERP系统采集数据设置', '1', '1');
INSERT INTO `node` VALUES ('101c6c256b8f4204b1d7401444ce2d7b', null, '模版', '2', '1');
INSERT INTO `node` VALUES ('10acb9a5938e448cbe32a8c152311c7a', '101c6c256b8f4204b1d7401444ce2d7b', '常用抵销分录模版', '2', '2');
INSERT INTO `node` VALUES ('128dae5bf5874d25b9276a1fb228a639', 'e9f1d0d52060470b9c46de75882d9eaa', '-', '21', '2');
INSERT INTO `node` VALUES ('184ac5c28bd6492ca13ba4ba8fb22df1', 'c8229b3d7817420eb058eee37fd217bb', '审计线索', '2', '3');
INSERT INTO `node` VALUES ('1ac0d5f756254afa9a5ebe14ea3e21a5', 'ff5e0614ef7d446fa02d95fc25d6c399', '手工导入报表数据', '1', '3');
INSERT INTO `node` VALUES ('1b811180c5314b349bce9aa34541f385', '3d176072c9b94d1ea6a0bf91b3f843b3', '审批流定义-业务单元', '3', '3');
INSERT INTO `node` VALUES ('23ccd8cf8f3943d698c636fb00e60d0c', 'c79045c361ac4286903b850d27edb593', '-', '3', '2');
INSERT INTO `node` VALUES ('24cf3bbb5cea490ca5627a3450d7ea7d', 'c8229b3d7817420eb058eee37fd217bb', '会计期间', '2', '3');
INSERT INTO `node` VALUES ('292067a3b80c43e1b54d8b9d94cb26cb', null, '模型', '2', '1');
INSERT INTO `node` VALUES ('2a356391b2cf48e3b530da2f5604c5d5', 'ac43de6d5a3045fa902830c4a2ad52fb', '往来账龄转换规则', '1', '3');
INSERT INTO `node` VALUES ('2bc6c9b235bf411a9a1dd0968058bda2', '0471b7ac9e044b9f90a069d2792f22ec', '套表管理', '2', '3');
INSERT INTO `node` VALUES ('3083cc3d63f4461e963444f142dee971', 'c8229b3d7817420eb058eee37fd217bb', '合并度量', '2', '3');
INSERT INTO `node` VALUES ('3668a1649e2b4b9c93a3a8359a679457', '0471b7ac9e044b9f90a069d2792f22ec', '维度管理', '2', '3');
INSERT INTO `node` VALUES ('370afdf151ad4c1d91d91304127074ea', '96a31fb94ba84b1ab2c940c58d828bf2', '预警条目配置-集团', '3', '3');
INSERT INTO `node` VALUES ('3d16c2bf2043430f8e439196b83f4ad3', null, '组织管理', '3', '1');
INSERT INTO `node` VALUES ('3d176072c9b94d1ea6a0bf91b3f843b3', 'b828f5b483be475b9a03456546fe51cb', '流程设计', '3', '2');
INSERT INTO `node` VALUES ('3d6320d9750841ae999c87ab4923a150', '86a1c246f45e4d46964a23eac1bd2746', '个别报表数据录入', '21', '3');
INSERT INTO `node` VALUES ('3d640dcc23e548fb87003fc34d85cd2b', null, '权限管理', '3', '1');
INSERT INTO `node` VALUES ('3e5d4e49b14a4334ba09e459cbbd9893', '8920cc1a4fbb4e529e104e69314f7c89', '个别报表任务填报', '22', '2');
INSERT INTO `node` VALUES ('40449b9e39f0418fa1d662b876c4132f', 'c8229b3d7817420eb058eee37fd217bb', '版本', '2', '3');
INSERT INTO `node` VALUES ('40a38d4c2c544685bac01babb3c71a09', 'ac43de6d5a3045fa902830c4a2ad52fb', '合并报表项目/科目映射关系设置', '1', '3');
INSERT INTO `node` VALUES ('41614a87de8f4e3e885974f6ddcfcde7', '60ade31afab84aa5a144fb46b566d6c6', '会计期间转换规则', '1', '3');
INSERT INTO `node` VALUES ('4d078e3822b9445cab819f95215a31cf', '3d16c2bf2043430f8e439196b83f4ad3', '-', '3', '2');
INSERT INTO `node` VALUES ('4f79a5fcee264729bbd5d3c4f5f16e8c', null, '数据转换设置', '1', '1');
INSERT INTO `node` VALUES ('4f9426cbedd2486c8d33ec354b7febf6', 'c8229b3d7817420eb058eee37fd217bb', '合并项目', '2', '3');
INSERT INTO `node` VALUES ('52c124c5f4cc41289dd91623adf1d22c', '60ade31afab84aa5a144fb46b566d6c6', '维度匹配规则设置：ERP科目/合并系统科目', '1', '3');
INSERT INTO `node` VALUES ('590748ba857d4ee785a829d3401fa6a8', '805801e898b9467e8830c7a297cfe881', '表样设计', '22', '3');
INSERT INTO `node` VALUES ('59dd3fd81b804508bac410e1dcc981e9', '4d078e3822b9445cab819f95215a31cf', '集团', '3', '3');
INSERT INTO `node` VALUES ('60ade31afab84aa5a144fb46b566d6c6', '0ecdc22853d349cca975d0ef59428424', '-', '1', '2');
INSERT INTO `node` VALUES ('65a363f19ab54411a7d2a31e2aa3ba32', '0471b7ac9e044b9f90a069d2792f22ec', '业务规则', '2', '3');
INSERT INTO `node` VALUES ('65bbecf0d9104588bae28b1ad6388882', 'ac43de6d5a3045fa902830c4a2ad52fb', '往来重分类转换规则', '1', '3');
INSERT INTO `node` VALUES ('6c7f51c94a8c4caa9502f38c9c3600f1', null, '档案', '2', '1');
INSERT INTO `node` VALUES ('73ff0f4a778d47c3bc301d7ab607b3d7', '07c49a04bf3a41a6a3fd464ec0369c1b', '角色组', '3', '3');
INSERT INTO `node` VALUES ('76238d98da9741069be43d3569366231', 'ec17da7775684ed6a4e61175dcc3e75f', '后台任务中心', '3', '2');
INSERT INTO `node` VALUES ('78e0b861086e482ca16c5c23f5ac77c6', '8f922856be424af0b440b48075736815', '手工导入凭证明细', '1', '3');
INSERT INTO `node` VALUES ('79244e5ea2984fe4b57c365a9fd19e21', null, '业务合并', '21', '1');
INSERT INTO `node` VALUES ('805801e898b9467e8830c7a297cfe881', '8920cc1a4fbb4e529e104e69314f7c89', '表样设计', '22', '2');
INSERT INTO `node` VALUES ('825d7bda842b482e98b9d268a97f73ab', null, '报表系统采集数据设置', '1', '1');
INSERT INTO `node` VALUES ('82755a2601b645c188f0fc0f92d4b0e0', '76238d98da9741069be43d3569366231', '后台任务部署', '3', '3');
INSERT INTO `node` VALUES ('833f9c17ff55418cb14370d62dc774e3', 'ff5e0614ef7d446fa02d95fc25d6c399', '会计期间转换规则', '1', '3');
INSERT INTO `node` VALUES ('83abb81b4fc840b49df052fb8b04f613', 'cae7fe28a7204300a54c2bfc12ef201d', '职责-业务单元', '3', '3');
INSERT INTO `node` VALUES ('86a1c246f45e4d46964a23eac1bd2746', '79244e5ea2984fe4b57c365a9fd19e21', '个别报表数据录入', '21', '2');
INSERT INTO `node` VALUES ('870522dd296049b495c7d2924c7ed680', '60ade31afab84aa5a144fb46b566d6c6', '维度匹配规则设置：辅助核算/维度', '1', '3');
INSERT INTO `node` VALUES ('881d06fab4f14ac481ca5c460589b0cd', '128dae5bf5874d25b9276a1fb228a639', '表单设计', '21', '3');
INSERT INTO `node` VALUES ('8920cc1a4fbb4e529e104e69314f7c89', null, '-', '22', '1');
INSERT INTO `node` VALUES ('8f922856be424af0b440b48075736815', '95f9a08b7f064d5a8bf2a4a8b302f169', '-', '1', '2');
INSERT INTO `node` VALUES ('8fc126a997e04de7a3930aea374e8d95', 'b08b57ac1e5e48838ed208541815ca5a', '数据权限', '3', '3');
INSERT INTO `node` VALUES ('90056a641dd84752ae9e5f2011630ac3', 'c8229b3d7817420eb058eee37fd217bb', '币种', '2', '3');
INSERT INTO `node` VALUES ('95f9a08b7f064d5a8bf2a4a8b302f169', null, 'ERP系统采集数据', '1', '1');
INSERT INTO `node` VALUES ('96a31fb94ba84b1ab2c940c58d828bf2', 'ec17da7775684ed6a4e61175dcc3e75f', '预警平台', '3', '2');
INSERT INTO `node` VALUES ('9947e93bf57f4a88a2275606e4fd9c8a', 'f8a4ff41ad0b42789f83e6ca891b9176', '业务消息配置', '3', '3');
INSERT INTO `node` VALUES ('9f01307fdd1846a4a9fc1b9b52bfb1a4', 'c8229b3d7817420eb058eee37fd217bb', '自定义档案定义', '2', '3');
INSERT INTO `node` VALUES ('a272d26f984a422ebb3899ffbead3825', '4d078e3822b9445cab819f95215a31cf', '业务合并组织体系', '3', '3');
INSERT INTO `node` VALUES ('a4b05d4c09184d248f1192bfd5b3829a', 'f8a4ff41ad0b42789f83e6ca891b9176', '消息模板-全局', '3', '3');
INSERT INTO `node` VALUES ('ac0ce567202a429980df39ce977d1722', 'ef1de60a9f3b4ae98ad20783f88f2128', '用户组', '3', '3');
INSERT INTO `node` VALUES ('ac43de6d5a3045fa902830c4a2ad52fb', '4f79a5fcee264729bbd5d3c4f5f16e8c', '-', '1', '2');
INSERT INTO `node` VALUES ('adb48c3eb09740eaa21dea4ec59ee613', 'cae7fe28a7204300a54c2bfc12ef201d', '职责-集团', '3', '3');
INSERT INTO `node` VALUES ('b08b57ac1e5e48838ed208541815ca5a', '3d640dcc23e548fb87003fc34d85cd2b', '授权管理', '3', '2');
INSERT INTO `node` VALUES ('b3c8a207ef5a42a388988c24dbebcf1e', '07c49a04bf3a41a6a3fd464ec0369c1b', '业务类角色', '3', '3');
INSERT INTO `node` VALUES ('b578f4e0a01842ae9b515c6ce10e352f', 'f8a4ff41ad0b42789f83e6ca891b9176', '消息模板-集团', '3', '3');
INSERT INTO `node` VALUES ('b7005f3f712741269c6ea87d257317ae', '07c49a04bf3a41a6a3fd464ec0369c1b', '管理类角色', '3', '3');
INSERT INTO `node` VALUES ('b828f5b483be475b9a03456546fe51cb', null, '流程管理', '3', '1');
INSERT INTO `node` VALUES ('b844ee7208294b269c5a1e21d397eb0e', 'c8229b3d7817420eb058eee37fd217bb', '业务方案', '2', '3');
INSERT INTO `node` VALUES ('bfa675973a3341318ded57d073afcc56', '0471b7ac9e044b9f90a069d2792f22ec', '应用模型', '2', '3');
INSERT INTO `node` VALUES ('c35b8d1bd58346519444a40e7d8fc8ca', 'b08b57ac1e5e48838ed208541815ca5a', '用户权限分配', '3', '3');
INSERT INTO `node` VALUES ('c37098a0e7be4f6aa4bf49937b40260b', 'ff5e0614ef7d446fa02d95fc25d6c399', '维度匹配规则设置', '1', '3');
INSERT INTO `node` VALUES ('c79045c361ac4286903b850d27edb593', null, '基础数据', '3', '1');
INSERT INTO `node` VALUES ('c8229b3d7817420eb058eee37fd217bb', '6c7f51c94a8c4caa9502f38c9c3600f1', '-', '2', '2');
INSERT INTO `node` VALUES ('c8a53928eeb945469c01ea5c89fff317', '23ccd8cf8f3943d698c636fb00e60d0c', '业务参数', '3', '3');
INSERT INTO `node` VALUES ('cae7fe28a7204300a54c2bfc12ef201d', '3d640dcc23e548fb87003fc34d85cd2b', '职责管理', '3', '2');
INSERT INTO `node` VALUES ('cb143e24df2945a7af7e3a0a879cb6cf', 'ef1de60a9f3b4ae98ad20783f88f2128', '用户', '3', '3');
INSERT INTO `node` VALUES ('ceab3218fb09445c95a7ac3ae8e22cb9', '8f922856be424af0b440b48075736815', '后台自动导入明细和辅助余额表', '1', '3');
INSERT INTO `node` VALUES ('d1452ce827754727ac1f211dd0a207cf', 'c8229b3d7817420eb058eee37fd217bb', '维度属性', '2', '3');
INSERT INTO `node` VALUES ('d46c1cf6f61f4b93985ec244c6d6933b', '101c6c256b8f4204b1d7401444ce2d7b', '常用调整分录模版', '2', '2');
INSERT INTO `node` VALUES ('db79c6657262480288858e97399259c9', 'ac43de6d5a3045fa902830c4a2ad52fb', '凭证数据转化为多维数据', '1', '3');
INSERT INTO `node` VALUES ('dbad50f34e0a402890f03984adae5973', '8f922856be424af0b440b48075736815', '手工导入辅助余额表', '1', '3');
INSERT INTO `node` VALUES ('e9f1d0d52060470b9c46de75882d9eaa', null, '表单设计', '21', '1');
INSERT INTO `node` VALUES ('ec17da7775684ed6a4e61175dcc3e75f', null, '客户化配置', '3', '1');
INSERT INTO `node` VALUES ('ef1de60a9f3b4ae98ad20783f88f2128', '3d640dcc23e548fb87003fc34d85cd2b', '用户管理', '3', '2');
INSERT INTO `node` VALUES ('f8a4ff41ad0b42789f83e6ca891b9176', 'ec17da7775684ed6a4e61175dcc3e75f', '统一沟通平台', '3', '2');
INSERT INTO `node` VALUES ('f93c9b4866c14052987f669b36aecbec', '3d176072c9b94d1ea6a0bf91b3f843b3', '审批流定义-集团', '3', '3');
INSERT INTO `node` VALUES ('fa292ac7a607421d8ca13fa73399707b', '4d078e3822b9445cab819f95215a31cf', '业务单元', '3', '3');
INSERT INTO `node` VALUES ('faed15dd9928431d9bd1f036ad4eea65', '3e5d4e49b14a4334ba09e459cbbd9893', '个别报表任务填报', '22', '3');
INSERT INTO `node` VALUES ('fe60759d80ee4fd9a055d68c7b555e20', 'c8229b3d7817420eb058eee37fd217bb', '股权投资方案', '2', '3');
INSERT INTO `node` VALUES ('ff5e0614ef7d446fa02d95fc25d6c399', '825d7bda842b482e98b9d268a97f73ab', '-', '1', '2');

-- ----------------------------
-- Table structure for `nodeinfo`
-- ----------------------------
DROP TABLE IF EXISTS `nodeinfo`;
CREATE TABLE `nodeinfo` (
  `id` varchar(32) NOT NULL,
  `nodeId` varchar(32) NOT NULL,
  `requirementFlag` tinyint(4) DEFAULT '0',
  `developFlag` tinyint(4) DEFAULT '0',
  `testFlag` tinyint(4) DEFAULT '0',
  `boss` varchar(20) DEFAULT NULL,
  `documentId` varchar(32) DEFAULT NULL,
  `productId` int(11) NOT NULL,
  `obj_code` varchar(255) DEFAULT NULL,
  `obj_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nodeinfo
-- ----------------------------
INSERT INTO `nodeinfo` VALUES ('124ed15b6dba4adea265a07cf17c8dfd', '870522dd296049b495c7d2924c7ed680', '0', '0', '0', null, 'f2e1d9d0c3764788882177a501f05fb2', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('1b99493c9a4c4c7cb09a3eea9ef72ea3', 'd1452ce827754727ac1f211dd0a207cf', '2', '0', '0', null, '93324fe94f614fdca2581d1977768bf6', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('218f4fa043cf4de590e3d8d3a494a123', 'a4b05d4c09184d248f1192bfd5b3829a', '0', '0', '0', null, '3915f0f168eb4a5bb61d2529bdd3c1ab', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('293b7334d2594d65a79332900151dfcd', 'b844ee7208294b269c5a1e21d397eb0e', '2', '0', '0', null, '7764336d6c4441f0b6a635527aaad28b', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('38655586f01c41099f3fe15d5cfb2355', 'b578f4e0a01842ae9b515c6ce10e352f', '0', '0', '0', null, 'e9023f4ebb10458581be87233da3c358', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('3ce1646b36634a32ae6b5582a2d29349', '41614a87de8f4e3e885974f6ddcfcde7', '2', '0', '0', 'Test', '5883ef65f0334956bf76f20081f3d86b', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('4066b36b1ec341e8ac9aa445f22092b4', 'adb48c3eb09740eaa21dea4ec59ee613', '0', '0', '0', null, 'cc737080e4254d8aaec9d5962797763d', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('432ccdf6b2024e4ebf6235c443499fd8', 'cb143e24df2945a7af7e3a0a879cb6cf', '0', '0', '0', null, '1015e5f068314635b4e57e03fe633a15', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('45c3f064b63d42d49f0f41ec211bd4e6', 'faed15dd9928431d9bd1f036ad4eea65', '0', '0', '0', null, '4a04429205754e2d9aef8a610c803c63', '22', null, null);
INSERT INTO `nodeinfo` VALUES ('477210b33ab94e348f3910b442662bd1', 'a272d26f984a422ebb3899ffbead3825', '2', '0', '0', null, 'd796bf76aca648da95bc1a73abaa2fea', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('4bacb1888bb148148377ae8d13c91512', '370afdf151ad4c1d91d91304127074ea', '0', '0', '0', null, '66cedb8658284c7c916112997b44f422', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('515cc43aa3554dc7a6f9a32ab5583b20', '52c124c5f4cc41289dd91623adf1d22c', '0', '0', '0', null, 'a4787fecee6d40ff8977958be3c4565a', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('54000e7398e94e9399203cd50294e3e7', '24cf3bbb5cea490ca5627a3450d7ea7d', '2', '0', '0', null, '5ae615ab82294c94ad3e4027d030cbb8', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('55aecc9e508f488e8a8cd5d8ed580713', '65a363f19ab54411a7d2a31e2aa3ba32', '1', '0', '0', null, '933771f0abb5420c80023a18e7692e51', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('5947dc0e3d2347b1999267899bbbe793', '1ac0d5f756254afa9a5ebe14ea3e21a5', '0', '0', '0', null, 'b915d5131f7a48af88fe75e6a3ee65ba', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('5ed15015307e4183805bca5df43623a7', '2bc6c9b235bf411a9a1dd0968058bda2', '0', '0', '0', null, '5008a77d37d04cde929264907fa70d4c', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('655b657e6162434197d81e6c9cf2abf7', '3d6320d9750841ae999c87ab4923a150', '1', '0', '0', null, 'ad82d07a3bf44c4bb2b07b1b52d57a6d', '21', null, null);
INSERT INTO `nodeinfo` VALUES ('6a5147d96080407bb047f4c49a95f7ca', '0b47ca1a41ec4b39ae7a33491f457929', '0', '0', '0', null, '1be242315aed4c82bd9ebfd79cefb7b7', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('6a5a25ca92e34797a3c3e24107489885', '8fc126a997e04de7a3930aea374e8d95', '0', '0', '0', null, '31aeaf04990042a2b0e1449b737ac42c', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('6fc8972bcd0b4425988404b2a446e730', 'ac0ce567202a429980df39ce977d1722', '0', '0', '0', null, '248ccbd102b6428bad2e011859817440', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('7268f85288ea41e1a9b71e73449c4c62', 'db79c6657262480288858e97399259c9', '0', '0', '0', null, 'c1f9da746d934af8a8b57eef2d17402f', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('75975205d23448b298949c304f9f222a', '590748ba857d4ee785a829d3401fa6a8', '0', '0', '0', null, 'd0948544584c46319396d296a04b20af', '22', null, null);
INSERT INTO `nodeinfo` VALUES ('769f9f25c83f460e865893a512eaa004', '82755a2601b645c188f0fc0f92d4b0e0', '0', '0', '0', null, 'fc0c703df699499baef6a8d5f85de41e', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('76e96b4d45854b28b3e3bf6bd61ca7ad', 'f93c9b4866c14052987f669b36aecbec', '0', '0', '0', null, 'bb234c06465c420986223368ca93e996', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('7856abe1e79741cdab952faeb5068baf', 'fa292ac7a607421d8ca13fa73399707b', '2', '0', '0', null, 'cb2cf66ce0db4347b226c0a511faf344', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('7c23a67018cd42c0be03cd8a8abee114', '83abb81b4fc840b49df052fb8b04f613', '0', '0', '0', null, '98044a30faf54e75b5909ec2695b699c', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('876889df3f104d0ea4f8ab9c4bfdac26', '2a356391b2cf48e3b530da2f5604c5d5', '0', '0', '0', null, '2fed30f290934a0d8554c84cc6db5101', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('8a5d484aa8994aa6bba7b10f388bdade', '90056a641dd84752ae9e5f2011630ac3', '2', '0', '0', null, 'ed325369ad954feabaf10ee73b3c22e5', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('8cce04586db443bebec66e7eba6ba880', '1b811180c5314b349bce9aa34541f385', '0', '0', '0', null, '01a789d2a8764ee39c2a921f410b4719', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('8d2bfed3e95544cd85e3f81085f80a27', '881d06fab4f14ac481ca5c460589b0cd', '1', '0', '0', null, 'f59b46777bb94942882cd3d10e104a37', '21', null, null);
INSERT INTO `nodeinfo` VALUES ('918d716da2a64efbb26f48787f5969ba', '09caf6ff09ac48d491d9bf936cba7d07', '0', '0', '0', null, '9b6aba2f0b4640eb8d2a22e04415b580', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('95eaccdac0d84111b5d004876ef8b8b6', 'ceab3218fb09445c95a7ac3ae8e22cb9', '0', '0', '0', null, '60d6ce65cca9462896ac31e23d72af0d', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('96860bc2757d4ecba9d3ad64454185ef', '73ff0f4a778d47c3bc301d7ab607b3d7', '0', '0', '0', null, 'a99bf278c9eb4243a5ae7c8ad779a361', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('9840ba5f3b8b4c2fb9ee6e570e3c0926', '3083cc3d63f4461e963444f142dee971', '2', '0', '0', null, 'f23d8156a78146039be8ba59d8738e7c', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('9fdc1b930dae4d67a383950cd58b47aa', '4f9426cbedd2486c8d33ec354b7febf6', '2', '0', '0', null, 'fe13d4a8843d44508e63bc1a0ca06dc4', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('b17ba5a30b7343aea27caad725951793', '833f9c17ff55418cb14370d62dc774e3', '0', '0', '0', null, '72c6cefb02d44dba94586486eeed2e88', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('b338cb57435441d9aaa43cf20b02c3a1', '40a38d4c2c544685bac01babb3c71a09', '0', '0', '0', null, '7047b22dedeb40f3a1d980977611ef6c', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('b53083268fa642a587a88ebbc8ecf80b', 'fe60759d80ee4fd9a055d68c7b555e20', '2', '0', '0', null, 'ac8ddedc926c4d5a9e206900245b6675', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('b5a92640e4a84fb2910d358013881686', '40449b9e39f0418fa1d662b876c4132f', '2', '0', '0', null, '0157f8682f084c80ba04f1bfa8684de8', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('bbc0555150b8483dbc8aafb1dd2a12f1', '184ac5c28bd6492ca13ba4ba8fb22df1', '2', '0', '0', null, '2665f75829be42f5ade204c8f066d6f8', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('c3ab5cc8f7294e308607b63d3415c54f', '003e5fc2f327445dad8f7730115fdada', '2', '0', '0', null, '611bc2db5bda4625888f1d51fff59b88', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('c5d039c999d544d3ba86d900a57f62b5', '3668a1649e2b4b9c93a3a8359a679457', '2', '0', '0', null, '73c3192ef8584d7abc2792923d63f9c0', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('c6a4b723e0a84c82b1481e5e33f21475', '0c07ae17fe25402b95da4200ccc4e35f', '2', '0', '0', null, '11fe50522f15425dbb76ae8039536953', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('db5b7b30579e4364936f0b2e579bab60', 'b3c8a207ef5a42a388988c24dbebcf1e', '0', '0', '0', null, '9964b02f2b5f45508fe3a5d7a2783964', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('df711f2fa96448afb5d8581189c98620', 'bfa675973a3341318ded57d073afcc56', '1', '0', '0', null, '129c3b99df0443f99c00bad21bc6b2ea', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('e5e067a1a234491eab93224cb3230d00', 'c8a53928eeb945469c01ea5c89fff317', '0', '0', '0', null, 'a1e5b5f4124a4b668cecfd788fa2f234', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('e6a570a1e79247bebb2562cfef067de0', 'b7005f3f712741269c6ea87d257317ae', '0', '0', '0', null, 'b11f8c65468e45748fe7c579f38a07f8', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('ea2d3cad72c64c2c9ea98964463d8306', '65bbecf0d9104588bae28b1ad6388882', '0', '0', '0', null, '1153467baf48466ca816284e04edf964', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('ee02505927e64e79bafd3cb70ef57e42', 'c37098a0e7be4f6aa4bf49937b40260b', '0', '0', '0', null, 'e1315b84a07140d3a56ae075cb011730', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('f3e99bb3c73045088d5ff786565ddf77', 'c35b8d1bd58346519444a40e7d8fc8ca', '0', '0', '0', null, '1aad7512e4414352914b26c3d87e98c2', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('f5538e951a8540ca8eaeaad9482f729c', '9f01307fdd1846a4a9fc1b9b52bfb1a4', '2', '0', '0', null, '5462fcefcc2f411bb55375e2c7593482', '2', null, null);
INSERT INTO `nodeinfo` VALUES ('f6421adeb44e42b19835dd621b0835db', '9947e93bf57f4a88a2275606e4fd9c8a', '0', '0', '0', null, 'a1439b1f0e084f4e9891322a0474c3c8', '3', null, null);
INSERT INTO `nodeinfo` VALUES ('f9588495e93a4f2eae79b37615df0993', '78e0b861086e482ca16c5c23f5ac77c6', '0', '0', '0', null, '6cba2649f67c40b088bebc6cc2484ff2', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('fa85cef931b848a1814100f0d7d713a3', 'dbad50f34e0a402890f03984adae5973', '0', '0', '0', null, 'f1ec063afffa4a698ac9fe63c4c1ab2f', '1', null, null);
INSERT INTO `nodeinfo` VALUES ('ff877300b78748a0825caeb52fe26ce0', '59dd3fd81b804508bac410e1dcc981e9', '0', '0', '0', null, '33a929afb5f748b5afb99b5fdd5e9c89', '3', null, null);

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '外系统数据采集');
INSERT INTO `product` VALUES ('2', 'EPM平台');
INSERT INTO `product` VALUES ('3', '动态建模平台');
INSERT INTO `product` VALUES ('11', '业务合并');
INSERT INTO `product` VALUES ('21', 'EXCEL客户端');
INSERT INTO `product` VALUES ('22', '业务合并EXCEL端');
