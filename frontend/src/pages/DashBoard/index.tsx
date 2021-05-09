import BarCharts from "components/BarCharts";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const DashBoard = () => {
    return (
        <>
        <NavBar />
    <div className="container" >
      <h1 className="text-primary py-3">Dashboard de Vendas!</h1>

      <div className="row px-3">
         <div className="col-sm-6">
            <h5  className="text-center text-secondary">taxa de Sucesso (%)</h5>
            <BarCharts/>

            </div>
            
         <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
            <DonutChart/>


        </div>
        <div className="py-3" >
      <h2 className="text-primary">Todas Vendas</h2>
      </div>

    </div>

      <DataTable/>
    </div>
    <Footer/>
    </>
    );
  }
  
  export default DashBoard;