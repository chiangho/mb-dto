package mb.douban.api.crawl.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * isbn+name+出版社+出版时间等于唯一，标题可以自定义
 * @author: wz1016_vip@163.com @Date: 2019/9/10
 */
@Getter
@Setter
public class BookSearchResponse {
    private Long code;

    private String isbn;

    private String splitIsbn;

    private String name;

    private String englishName;

    private String title;

    private String seriesName;

    private Integer copiesCount;

    private String   cip;

    private String clc;

    private String author;

    private String introduction;

    private String content;

    private String   publisher;

    private String  publishingTime;

    private String  publishingAddress;

    private String edition;

    private String print;

    private BigDecimal score;

    private String translate;

    private String editor;

    private String illustrator;

    private String pageCount;

    private String folio;

    private String size;

    private String weight;

    private String price;

    private Object image;

}
