package com.kar.PMSystem.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InviteRequest {

    private long projectId;
    private String email;

    public String getEmail() {
        return null;
    };

    public Long getProjectId() {
        return null;
    };
}
