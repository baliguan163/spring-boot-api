
http://127.0.0.1:3333//yangxian/new?page=2&size=2
http://127.0.0.1:3333//yangxian/new/156
--------------------------------------------------------------------

https://127.0.0.1:8888//yangxian/new?page=2&size=2
https://127.0.0.1:8888//yangxian/new/156
--------------------------------------------------------------------


SET FOREIGN_KEY_CHECKS=0;
-- #
-- # ---------------------遍历sheet1中所有单元格--------------------------------
-- # row:['商品一级类目', '店铺名称', '平台类型', '商品id', '商品名称', '商品链接', '商品主图', '商品价格(单位：元)', '收入比率(%)', '开推时间', '优惠券面额', '券后价', '优惠券总量', '优惠券剩余量', '优惠券开始时间', '优惠券结束时间', '推广链接', '备注']
-- # dd rown: 1721     0:商品一级类目    :美容护肤/美体/精油
-- # dd rown: 1721     1:店铺名称      :森田药妆官方旗舰店
-- # dd rown: 1721     2:平台类型      :天猫
-- # dd rown: 1721     3:商品id      :557662696505
-- # dd rown: 1721     4:商品名称      :【预售】35片森田药妆玻尿酸补水保湿亮肤修护精华匀亮面膜套装
-- # dd rown: 1721     5:商品链接      :http://item.taobao.com/item.htm?id=557662696505
-- # dd rown: 1721     6:商品主图      :http://img.alicdn.com/bao/uploaded/i2/641875610/TB1dNzLbBDH8KJjSszcXXbDTFXa_!!0-item_pic.jpg
-- # dd rown: 1721     7:商品价格(单位：元):149.00
-- # dd rown: 1721     8:收入比率(%)   :4.00
-- # dd rown: 1721     9:开推时间      :2017-11-03
-- # dd rown: 1721    10:优惠券面额     :无
-- # dd rown: 1721    11:券后价       :
-- # dd rown: 1721    12:优惠券总量     :0
-- # dd rown: 1721    13:优惠券剩余量    :0
-- # dd rown: 1721    14:优惠券开始时间   :
-- # dd rown: 1721    15:优惠券结束时间   :
-- # dd rown: 1721    16:推广链接      :https://s.click.taobao.com/t?e=m%3D2%26s%3DwjLyIMUsYHccQipKwQzePOeEDrYVVa64K7Vc7tFgwiFRAdhuF14FMYLrermjXBh75x%2BIUlGKNpU8zPJvLRDF39ynaO8inv88V%2B4ure15Jrvsae04h05DSylfS%2F6S3PYWnn80kOvQNpQk7%2B9mrZpO5tFVTgmw2g34omfkDJRs%2BhU%3D
-- # dd rown: 1721    17:备注        :官方推荐
DROP TABLE IF EXISTS `tian_mao_goods`;
CREATE TABLE `tian_mao_goods` (
              `id` int(11) NOT NULL AUTO_INCREMENT,
              `goods_1_category` varchar(32)  DEFAULT  NULL,
              `shop_name`        varchar(32)  DEFAULT  NULL,
              `platform_type`    varchar(8) DEFAULT NULL,
              `goods_id`    varchar(16) NOT  NULL,
              `goods_name`  varchar(64) DEFAULT NULL,
              `goods_url`    varchar(1024) DEFAULT NULL,
              `goods_pic_url`  varchar(1024) DEFAULT NULL,
              `goods_price`    varchar(8) DEFAULT NULL,
              `income_rate`     varchar(8) DEFAULT NULL,
              `sale_date`       varchar(64) DEFAULT NULL,
              `denomination`    varchar(128) DEFAULT NULL,
              `discount_coupon_price`    varchar(8) DEFAULT NULL,
              `discount_coupon_sum`   varchar(8) DEFAULT NULL,
              `discount_coupon_residue`  varchar(8) DEFAULT NULL,
              `discount_coupon_begin_date`  varchar(64) DEFAULT NULL,
              `discount_coupon_end_date`  varchar(64) DEFAULT NULL,
              `generalize_url`  varchar(1024) DEFAULT NULL,
              `remark`  varchar(64) DEFAULT NULL,
              PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


# '商品id',
# '商品名称',
# '商品主图',
# '商品详情页链接地址',
# '商品一级类目',

# '淘宝客链接',
# '商品价格(单位：元)',
# '商品月销量',
# '收入比率(%)',
# '佣金',

# '卖家旺旺',
# '卖家id',
# '店铺名称',
# '平台类型',
# '优惠券id',

# '优惠券总量',
# '优惠券剩余量',
# '优惠券面额',
# '优惠券开始时间',
# '优惠券结束时间',

# '优惠券链接',
# '商品优惠券推广链接'

DROP TABLE IF EXISTS `choiceness_goods_list`;
CREATE TABLE `choiceness_goods_list` (
               `id` int(11) NOT NULL AUTO_INCREMENT,
               `goods_id`    varchar(16) NOT  NULL,
               `goods_name`  varchar(128) DEFAULT NULL,
               `goods_url`    varchar(1024) DEFAULT NULL,
               `goods_detail_url`    varchar(1024) DEFAULT NULL,
               `goods_1_category` varchar(32)  DEFAULT  NULL,
               `tao_bao_ke_url`    varchar(1024) DEFAULT NULL,
               `goods_price`    varchar(8) DEFAULT NULL,
               `monthl_sales_volume`  varchar(32)  DEFAULT  NULL,
               `income_rate`     varchar(8) DEFAULT NULL,
               `commission`    varchar(8) DEFAULT NULL,
              `seller_wang_wang`  varchar(64) DEFAULT NULL,
              `seller_id`  varchar(16) DEFAULT NULL,
              `shop_name`        varchar(128)  DEFAULT  NULL,
              `platform_type`    varchar(8) DEFAULT NULL,
              `discount_coupon_id`    varchar(64) DEFAULT NULL,
              `discount_coupon_sum`   varchar(8) DEFAULT NULL,
              `discount_coupon_residue`  varchar(8) DEFAULT NULL,
               `denomination`    varchar(128) DEFAULT NULL,
              `discount_coupon_begin_date`  varchar(64) DEFAULT NULL,
              `discount_coupon_end_date`  varchar(64) DEFAULT NULL,
              `generalize_url`  varchar(1024) DEFAULT NULL,
              `discount_coupon_generalize_url`  varchar(1024) DEFAULT NULL,
              PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


SET FOREIGN_KEY_CHECKS=1;

-- UPDATE battery_data SET battery_is_bingding = 0 WHERE battery_is_bingding = 1;
-- UPDATE battery_ccd SET plastic_battery_check_status = 0 WHERE plastic_battery_check_status = 1;

--   @PostMapping("/list_by_code")
--     public Result list_by_code(@RequestParam(value = "code") String code) {
--         Condition condition = new Condition(BatteryCore.class);
--         condition.or().andEqualTo("plasticCarveCode1",code);
--         condition.or().andEqualTo("plasticCarveCode2",code);
--         condition.orderBy("batteryCoreCheckDate").desc();
--         List<BatteryCore> list = batteryCoreService.findByCondition(condition);
--         PageInfo pageInfo = new PageInfo(list);
--         return ResultGenerator.genSuccessResult(pageInfo);
--     }



--    @PostMapping("/list")
--     public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
--         PageHelper.startPage(page, size);
--
--         //设置查询条件 降序
--         Condition condition = new Condition(BatteryCcd.class);
--         condition.orderBy("batteryCheckPicDate").desc();
-- //        List<BatteryCcd> list = batteryCcdService.findAll();
--         List<BatteryCcd> list = batteryCcdService.findByCondition(condition);
--         PageInfo pageInfo = new PageInfo(list);
--         return ResultGenerator.genSuccessResult(pageInfo);
--     }
--
--     @PostMapping("/list_by_code")
--     public Result list_by_code(@RequestParam(value = "code") String code,
--                                @RequestParam(defaultValue = "0") Integer page,
--                                @RequestParam(defaultValue = "0")  Integer size) {
--         PageHelper.startPage(page, size);
--
--         //设置查询条件
--         Condition condition = new Condition(BatteryCcd.class);
--         condition.and().andEqualTo("batteryPlasticCode",code);
--         condition.orderBy("batteryCheckPicDate").desc();
--         List<BatteryCcd> list = batteryCcdService.findByCondition(condition);
--         PageInfo pageInfo = new PageInfo(list);
--         return ResultGenerator.genSuccessResult(pageInfo);
--     }


