package mb.douban.api.crawl.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author: wz1016_vip@163.com @Date: 2019/9/10
 */
@Getter
@Setter
public class BookCrawlResponse {
    private String isbn;
    /**
     * 书名
     */
    private String name;
    /**
     * 书名
     */
    private String title;
    /**
     * 价格
     */
    private String price;
    /**
     * 作者
     */
    private String author;
    /**
     * 出版商
     */
    private String publisher;
    /**
     * 出版时间
     */
    private String publishingTime;
    /**
     * 评分
     */
    private BigDecimal score;
    /**
     * 译者
     */
    private String translate;
    /**
     * 插图
     */
    private String illustrator;
    /**
     * 页数
     */
    private String pageCount;
}
