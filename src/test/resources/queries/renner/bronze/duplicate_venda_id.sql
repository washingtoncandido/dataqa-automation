SELECT
    venda_id,
    COUNT(*) AS quantidade
FROM dataqa.renner.bronze_vendas
GROUP BY venda_id
HAVING COUNT(*) > 1;