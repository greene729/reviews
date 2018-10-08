package org.wecancodeit.studentroster.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviews.model.Review;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "the corner", "corner.jpg", "open air", "2/5 - Comments."));
		add(new Review(2L, "the top of the fridge", "top-of-fridge.jpg", "open air", "3/5 - Comments"));
		add(new Review(3L, "the safe", "safe.jpg", "container", "4/5 - Secure, but not very accessible"));
		add(new Review(4L, "the toilet tank", "toilet-tank.jpg", "container",
				"3/5 - Not place people look, easily accesible, but wet"));
		add(new Review(5L, "on a tummy", "tummy.jpg", "container", "5/5 - Secure, delicious."));
	}

	public int size() {
		return reviews.size();
	}

	public void add(Review review) {
		reviews.put(review.getId(), review);
	}

	public Review findOne(long id) {
		return reviews.get(id);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
