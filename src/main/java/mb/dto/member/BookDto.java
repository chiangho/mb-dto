package mb.dto.member;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * isbn+name+出版社+出版时间等于唯一，标题可以自定义
 * @author Administrator
 *
 */
public class BookDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

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

	private String image;
	
	
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getSplitIsbn() {
		return splitIsbn;
	}

	public void setSplitIsbn(String splitIsbn) {
		this.splitIsbn = splitIsbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Integer getCopiesCount() {
		return copiesCount;
	}

	public void setCopiesCount(Integer copiesCount) {
		this.copiesCount = copiesCount;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getClc() {
		return clc;
	}

	public void setClc(String clc) {
		this.clc = clc;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishingTime() {
		return publishingTime;
	}

	public void setPublishingTime(String publishingTime) {
		this.publishingTime = publishingTime;
	}

	public String getPublishingAddress() {
		return publishingAddress;
	}

	public void setPublishingAddress(String publishingAddress) {
		this.publishingAddress = publishingAddress;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPrint() {
		return print;
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getTranslate() {
		return translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getIllustrator() {
		return illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
