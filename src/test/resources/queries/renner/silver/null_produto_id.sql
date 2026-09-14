SELECT
    venda_id,
    produto_id
FROM dataqa.renner.silver_vendas
WHERE produto_id IS NULL
   OR TRIM(CAST(produto_id AS STRING)) = '';