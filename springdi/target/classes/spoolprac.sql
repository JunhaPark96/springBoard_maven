drop table t_board;
drop sequence seq_t_board_no;
create table t_board(
    no          number(5)       primary key,
    title       varchar2(100)   not null,
    writer      varchar2(100)   not null,
    content     varchar2(1000)  not null,
    reg_date    date            default sysdate,
    count       number(5)       default 0
);
create sequence seq_t_board_no nocache;

select * from t_board;
SELECT * FROM v$session;