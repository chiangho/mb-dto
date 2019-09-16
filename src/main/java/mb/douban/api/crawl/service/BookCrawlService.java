package mb.douban.api.crawl.service;

import mb.douban.api.crawl.request.BookCrawlRequest;
import mb.douban.api.crawl.response.BookCrawlResponse;

import java.util.List;

/**
 * @author: wz1016_vip@163.com @Date: 2019/9/10
 */
public interface BookCrawlService {
    List<BookCrawlResponse> crawl(BookCrawlRequest request);
}
