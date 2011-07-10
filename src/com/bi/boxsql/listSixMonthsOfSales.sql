SELECT month, total
FROM sale
WHERE date BETWEEN ':startDate' AND ':endDate'
ORDER BY seq