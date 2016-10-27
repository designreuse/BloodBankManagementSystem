package com.bbms.web.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;
import org.springframework.web.servlet.view.jasperreports.JasperReportsXlsView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.bbms.web"})
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver() {
        return new TilesViewResolver();
    }
    @Bean
    public TilesConfigurer tilesCongurer() {
        String[] tilesDefinitions = {"/tiles/tiles.xml"};
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(tilesDefinitions);
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
    @Bean
    public JasperReportsViewResolver getJasperReportsViewResolver() {
        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
        resolver.setPrefix("classpath:/reports/");
        resolver.setSuffix(".jasper");
        resolver.setReportDataKey("datasource");
        resolver.setViewNames("rpt_*");
        resolver.setViewClass(JasperReportsMultiFormatView.class);
        resolver.setOrder(0);
        return resolver;
    }
    @Bean
    @Qualifier("donorGroupRegisterPdfReport")
    public JasperReportsPdfView donorGroupRegisterPdfReport() {
        JasperReportsPdfView v = new JasperReportsPdfView();
        v.setUrl("classpath:/reports/donorsABOGroupReport.jasper");
        v.setReportDataKey("datasource");
        return v;
    }
    @Bean
    @Qualifier("donorGroupRegisterExcellReport")
    public JasperReportsXlsView donorGroupRegisterExcellReport() {
        JasperReportsXlsView jasperReportsXlsView = new JasperReportsXlsView();
        jasperReportsXlsView.setUrl("classpath:/reports/donors.jasper");
        jasperReportsXlsView.setReportDataKey("datasource");
        return jasperReportsXlsView;
    }
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messagesource/messages_EN");
        return messageSource;
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
