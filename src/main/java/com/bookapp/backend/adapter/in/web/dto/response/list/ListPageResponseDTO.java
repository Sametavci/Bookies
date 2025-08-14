package com.bookapp.backend.adapter.in.web.dto.response.list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListPageResponseDTO {
    private List<ListShortResponseDTO> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
}
