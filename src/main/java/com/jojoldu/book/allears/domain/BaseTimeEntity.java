package com.jojoldu.book.allears.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
/* @MppedSuperclass = JPA 클래스들이 BaseTimeEntity를 상속할 경우, 필드들도 칼럼으로 인식하게 함.
*  @EntityListeners(AuditingEntityListener.class) = 클래스에 Auditing 기능 추가
* */


@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    // Entity가 생성되어 저장될 때 시간이 자동 저장된다.
    @CreatedDate
    private LocalDateTime createdDate;

    // 조회한 Entity객체의 값이 변경될 때 시간을 자동 저장.
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
