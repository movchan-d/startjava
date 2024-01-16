\echo Все роботы
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Неуничтоженные роботы
SELECT *
  FROM jaegers
 WHERE status = 'Active'
 ORDER BY model_name;

\echo Роботы серий Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN (1, 4);
 ORDER BY model_name;

\echo Роботы кроме серий Mark-1 и Mark-4 (сортировка Mark по убыванию)
SELECT *
  FROM jaegers
 WHERE mark NOT IN (1, 4)
 ORDER BY mark DESC;

\echo Самый старый робот
SELECT *
  FROM jaegers
 WHERE launch = (SELECT MIN(launch)
                   FROM jaegers)
 ORDER BY model_name;
 
\echo Роботы, которые уничтожили больше всех kaiju (сортировка kaiju по убыванию)
SELECT *
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
                       FROM jaegers)
 ORDER BY kaiju_kill DESC;

\echo Средний вес роботов, округленный до 3-х знаков
SELECT ROUND(AVG(weight), 3) AS avg_weight
  FROM jaegers;

\echo Увеличение на 1 kaiju у неуничтоженных роботов
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

SELECT *
  FROM jaegers
 ORDER BY model_name;
  
\echo Удаление уничтоженных роботов
DELETE FROM jaegers
 WHERE status = 'Destroyed';
 
SELECT *
  FROM jaegers
 ORDER BY model_name;