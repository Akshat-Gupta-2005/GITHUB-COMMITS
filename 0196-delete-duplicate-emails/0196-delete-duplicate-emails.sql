DELETE p1 
FROM Person p1
join Person p2
on p1.email = p2.email
where p1.id > p2.id;
