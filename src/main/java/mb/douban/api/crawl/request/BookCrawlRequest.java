package mb.douban.api.crawl.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: wz1016_vip@163.com @Date: 2019/9/10
 */
@Getter
@Setter
public class BookCrawlRequest {
    /**
     * 书名
     */
    private String name;
    private String author;
    private String isbn;
}
