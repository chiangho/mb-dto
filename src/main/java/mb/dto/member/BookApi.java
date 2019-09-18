package mb.dto.member;

import java.util.List;

public interface BookApi {
	
	//更新图书信息
	public boolean updateBook(List<BookDto> books);
	
}
