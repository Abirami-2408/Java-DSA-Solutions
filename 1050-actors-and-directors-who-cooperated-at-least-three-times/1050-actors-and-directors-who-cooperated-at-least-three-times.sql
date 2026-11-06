# Write your MySQL query statement below
select DISTINCT actor_id,director_id
from ActorDirector 
GROUP BY actor_id, director_id
Having COUNT(*) > 2;