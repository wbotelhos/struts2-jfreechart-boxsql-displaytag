SELECT number, date, item, total
FROM purchase
WHERE date_format(date, '%Y') = :year