package com.team.sop_management_service.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reviews")
public class Review {
    @Id
    private String id;

    private int reviewerId;  // ID of the user who reviewed the SOP
    private boolean isConfirmed;  // Whether the review is a confirmation or return

    public static boolean isConfirmed() {
        return true;
    }

    public static boolean isConfirmed(int user) {
        return true;
    }
}
