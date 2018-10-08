package org.wecancodeit.reviews.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.studentroster.repositories.ReviewRepository;

@Controller
public class ReviewController {

	private ReviewRepository reviewRepository = new ReviewRepository();

//	@GetMapping("/")
//	public String home(Model model) {
//		model.addAttribute(reviewRepository.findAll());
//		return "reviews";
//	}

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute(reviewRepository.findAll());
		return "reviews";
	}

	@GetMapping("/reviews/{id}")
	public String getReview(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(reviewRepository.findOne(id));
		model.addAttribute("student", reviewRepository.findOne(id));
		return "student";
	}

}
