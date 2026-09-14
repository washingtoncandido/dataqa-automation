SELECT
    venda_id,
    COUNT(*) AS quantidade
FROM dataqa.renner.silver_vendas
WHERE venda_id IS NOT NULL
GROUP BY venda_id
HAVING COUNT(*) > 1;

