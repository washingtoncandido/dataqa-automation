SELECT
    venda_id,
    produto_id,
    valor_unitario
FROM dataqa.renner.silver_vendas
WHERE valor_unitario IS NULL
   OR valor_unitario < 0;