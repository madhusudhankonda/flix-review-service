package com.chocolateminds.flixreviewservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MVC Controller for Movies
 */

@RestController
public class MovieReviewController {
    @GetMapping("/reviews")
    public String getReviews(String movieTitle){
        return "Bad Movie";
    }

    @GetMapping("/review")
    public String getReview(String movieTitle){
        return "Movie Review 1";
    }

}
