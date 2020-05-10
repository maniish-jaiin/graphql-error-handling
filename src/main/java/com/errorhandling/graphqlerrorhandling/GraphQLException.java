package com.errorhandling.graphqlerrorhandling;

import graphql.*;
import graphql.language.*;
import java.util.*;

/**
 *  Required for interoperability between Kotlin and Java as a Kotlin class cannot
 * extend RuntimeException and implement GraphQLError at the same time because of the
 * method signature of getMessage()
 */

public class GraphQLException extends RuntimeException implements GraphQLError {

    String customMessage;

    public GraphQLException(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public String getMessage() {
        return customMessage;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }
}
