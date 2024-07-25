package com.csg.search.object;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SearchCriteria {
    private Boolean startWithUpperCase;
    private Integer minWordLength;
    // available for next feature (new kind of search criteria)
}
