SELECT
    venda_id,
    valor_bruto,
    desconto
FROM dataqa.renner.silver_vendas
WHERE desconto > valor_bruto;