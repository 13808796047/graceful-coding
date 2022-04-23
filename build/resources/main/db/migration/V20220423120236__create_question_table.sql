create table question
(
    id int not null auto_increment,
    questioner_id varchar(30) not null,
    title  varchar(30) not null,
    detail  text null,
    primary key (id)
)