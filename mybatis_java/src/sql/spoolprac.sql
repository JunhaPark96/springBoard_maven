create table t_board(
    no number(5) primary key,
    title varchar2(100) not null,
    writer varchar2(100) not null,
    content varchar2(1000) not null,
    reg_date date default sysdate,
    count number(5) default 0
);