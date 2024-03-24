package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Event;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 24, 2024  
*/
@Repository
public interface EventRepo extends JpaRepository<Event, Long> {

}
