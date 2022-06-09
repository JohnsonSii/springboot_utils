package com.johnsonsii.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;


public class CodeGenerator {

    // TODO 设置数据库账号密码，ip和库名，作者
    private static final String url = "jdbc:mysql://127.0.0.1:3306/johnsonsii?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=GMT%2b8";
    private static final String username = "root";
    private static final String password = "020328";
    private static final String author = "johnsonsii";

    public static void main(String[] args) {
        FastAutoGenerator.create(new DataSourceConfig.Builder(url, username, password)
                .dbQuery(new MySqlQuery())
                .typeConvert(new MySqlTypeConvert())
                .keyWordsHandler(new MySqlKeyWordsHandler()))
                .globalConfig(builder -> {
                    // 设置作者
                    builder.author("".equals(author) ? System.getProperty("user.name") : author)
                            // 使用java8新的时间类型
                            .dateType(DateType.TIME_PACK)
                            // 指定日期格式化方式
                            .commentDate("yyyy-MM-dd hh:mm:ss")
                            // 开启 swagger 模式
//                            .enableSwagger()
                            // 开启kotlin模式
//                            .enableKotlin()
                            // 覆盖已生成文件
//                            .fileOverride()
                            // 禁止打开输出目录
//                            .disableOpenDir()
                            // TODO 指定输出目录 选择项目目录下src/main/java文件夹，idea右键复制绝对路径，粘贴到下面即可
                            .outputDir("C:\\Users\\Developer\\Desktop\\spring_blog\\src\\main\\java");
                })
                .packageConfig(builder -> {
                    // TODO 设置父包名
                    builder.parent("com.johnsonsii")
                            // 设置父包模块名
//                            .moduleName("system")
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller");
                })
                .strategyConfig(builder -> {
                    // TODO 设置过滤表前缀以及表名
                    builder.addTablePrefix("t_")
                            // 设置需要生成的表名 不设置表名则生成全部表
//                            .addInclude("t_simple")
                            // 开启跳过视图
                            .enableSkipView();

                    // 设置实体类策略
                    builder.entityBuilder()
                            // 开启链式模型
                            .enableChainModel()
                            // 开启lombok
//                            .enableLombok()
                            // 移除boolean的is前缀
                            .enableRemoveIsPrefix()
                            // 从数据库中生成字段注解
                            .enableTableFieldAnnotation()
                            // 全局id策略
                            .idType(IdType.AUTO)
                            // 乐观锁字段名
                            .versionColumnName("version")
                            // 逻辑删除字段名
                            .logicDeleteColumnName("delete_flag")
                            // 逻辑删除属性名
                            .logicDeletePropertyName("deleteFlag")
                            // 命名规则下划线转驼峰
                            .naming(NamingStrategy.underline_to_camel)
                            // 数据库表字段映射到实体的命名策略
                            .columnNaming(NamingStrategy.underline_to_camel)
                            // 设置表字段自动填充
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE));

                    // mapper 生成策略
                    builder.mapperBuilder()
                            // 开启@Mapper注解
                            .enableMapperAnnotation();

                    // service 生成策略
                    builder.serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl");

                    // controller 生成策略
                    builder.controllerBuilder()
                            // 开启驼峰连字符
                            .enableHyphenStyle()
                            // 开始@RestController
                            .enableRestStyle();


                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}