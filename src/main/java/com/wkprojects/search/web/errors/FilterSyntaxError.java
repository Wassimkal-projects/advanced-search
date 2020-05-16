package com.wkprojects.search.web.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FilterSyntaxError extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public FilterSyntaxError(final String title) {
        super(URI.create("/filter-syntax-error"), title, Status.BAD_REQUEST);

    }
}
