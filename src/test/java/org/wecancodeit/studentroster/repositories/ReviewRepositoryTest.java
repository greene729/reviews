package org.wecancodeit.studentroster.repositories;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.reviews.model.Review;
import org.wecancodeit.studentroster.repositories.ReviewRepository;

public class ReviewRepositoryTest {

	private ReviewRepository reviewRepository = new ReviewRepository();

	@Test
	public void shouldAcceptReviews() {
		Review underTest = new Review(6L, "The Cabinet", "cabinet.jpg", "areas to hide grapes", "4/5 - Comments.");
		int repoSizeBeforeAdding = reviewRepository.size();
		reviewRepository.add(underTest);
		int repoSizeAfterAdding = reviewRepository.size();
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
	}

	@Test
	public void findOneShouldReturnOneReviews() {
		Review underTest = new Review(1L, "the corner", "corner.jpg", "areas to hide grapes", "2/5 - Comments.");
		reviewRepository.add(underTest);
		Review result = reviewRepository.findOne(1L);
		assertThat(result.getTitle(), is("the corner"));
	}

	@Test
	public void findAllShouldReturnAllReviews() {
		Review underTest = new Review(7L, "Individually in the mugs", "mugs.jpg", "areas to hide grapes",
				"0/5 - Everybody uses those mugs.");
		Review underTestToo = new Review(8L, "amongst the other grapes", "grapes.jpg", "areas to hide grapes",
				"3/5 - Sneaky, but too much collateral grape loss.");

		reviewRepository.add(underTest);
		reviewRepository.add(underTestToo);

		Collection<Review> result = reviewRepository.findAll();
		assertThat(result, hasItems(underTest, underTestToo));
	}

}
