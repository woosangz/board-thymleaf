package idusw.springboot.boardthymleaf.domain;

import lombok.*; //상용구(통상적으로 사용되는 코드)

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Memo {
    private Long mno;
    private String memoText;

}
