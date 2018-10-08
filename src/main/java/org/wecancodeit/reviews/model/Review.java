package org.wecancodeit.reviews.model;

public class Review {

	private Long id;
	private String title;
	private String imageUrl;
	private String category;
	private String content;

	public Review(Long id, String title, String imageUrl, String category, String content) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}
