import React from 'react';
import Photo from './Photo';

type Props = {
    photoList: string[]
}

const Posts: React.FC<Props> = (props) => {
    return (
        <ul>
            {props.photoList.map((photoData: string, i: number) => (
                <Photo photoData={photoData}></Photo>
            ))}
        </ul>
    )  
}

export default Posts;