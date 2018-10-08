package org.wecancodeit.reviews.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeOkWhenAccessingReviews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnReviewsTemplateWhenAccessingReviews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(view().name("reviews"));
	}

	@Test
	public void shouldBeOkWhenAccessingReview() throws Exception {
		mockMvc.perform(get("/review/1")).andExpect(status().isOk());
	}

}
