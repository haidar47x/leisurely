// import electronLogo from './assets/electron.svg';
import SoundPlayer from './components/SoundPlayer';
import TitleBar from './components/Titlebar';
import Tracker from './components/Tracker';

function App(): JSX.Element {
  // const ipcHandle = (): void => window.electron.ipcRenderer.send('ping');

  return (
    <div className="app w-full h-screen flex flex-col flex-nowrap justify-start">
      <TitleBar />
      <div className="flex flex-1">
        <Tracker />
        <SoundPlayer />
      </div>
    </div>
  );
}

export default App;
