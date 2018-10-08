package org.wecancodeit.review.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviews.model.Review;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "The corner", "corner.jpg", "open air",
				"2/5 - It's not a corner people typically go to, but isn't really even hidden like at all. Comfy tho."));
		add(new Review(2L, "The top of the fridge", "top-of-fridge.jpg", "open air",
				"3/5 - High up. Close to snacks. Prime sneak attack spot. Very highly visible."));
		add(new Review(3L, "The safe", "safe.jpg", "container",
				"3/5 - Secure, but not very accessible. Human almost never opens. Dangerous if you get stuck."));
		add(new Review(4L, "The toilet tank", "toilet-tank.jpg", "container",
				"1/5 - Not place people look; very good hiding spot. Not easily accesible. Very wet."));
		add(new Review(5L, "On a tummy", "tummy.jpg", "container",
				"5/5 - Not hidden but very annoying to human. Warm. Forces pats from human."));
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
