SELECT
    venda_id,
    valor_unitario
FROM dataqa.renner.bronze_vendas
WHERE valor_unitario < 0
   OR valor_unitario IS NULL;