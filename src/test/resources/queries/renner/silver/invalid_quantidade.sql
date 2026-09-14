SELECT
    venda_id,
    produto_id,
    quantidade
FROM dataqa.renner.silver_vendas
WHERE quantidade IS NULL
   OR quantidade <= 0;