package mb.douban.api.crawl.service;

import mb.douban.api.crawl.request.BookSearchRequest;
import mb.douban.api.crawl.response.BookSearchResponse;

import java.util.List;

/**
 * @author: wz1016_vip@163.com @Date: 2019/9/10
 */
public interface BookSearchService {
    List<BookSearchResponse> searchAndSave(BookSearchRequest request);
}
