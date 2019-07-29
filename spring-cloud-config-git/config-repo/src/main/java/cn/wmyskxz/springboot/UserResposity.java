package cn.wmyskxz.springboot;

import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserResposity extends JpaRepository<User,Long> {
//   User findByUserName(String userName);
   User findByUserNameOrEmial(String userName);
//   Long deleteById(Long id);
   Long countByUserName(String userName);
   List<User> findByEmailLike(String email);
   User findByUserNameIngoreCase(String userName);
   List<User> findByUserNameOrderByEmailDesc(String email);
//   Page<User> findAll(Pageable pageable);
   Page<User> findByUserName(String userName, Pageable pageable);
   @Transactional
   @Modifying
   @Query("update user u set u.userName=?1 where u.id=?2")
   int modifyByIdAndUserid(String userName,Long id);
}
